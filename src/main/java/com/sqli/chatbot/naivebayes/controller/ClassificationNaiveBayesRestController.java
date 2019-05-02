package com.sqli.chatbot.naivebayes.controller;

import com.sqli.chatbot.naivebayes.service.ClassificationNaiveBayesDomainService;
import com.sqli.chatbot.naivebayes.service.ClassificationNaiveBayesKeywordService;
import com.sqli.chatbot.naivebayes.util.dto.SearchQueryResponse;
import com.sqli.chatbot.naivebayes.util.factory.SearchQueryResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/naivesBayes")
@CrossOrigin("*")
public class ClassificationNaiveBayesRestController {
    @Autowired
    private ClassificationNaiveBayesDomainService domainService;
    @Autowired
    private ClassificationNaiveBayesKeywordService keywordService;

    @GetMapping(value = "/domain/{query}")
    private ResponseEntity<SearchQueryResponse> getDomainFromSearchQuery(@PathVariable("query") String request){
        try {
            String domain=domainService.getDomainFromSearchQuery(request);
            String keyword=keywordService.getKeywordFromSearchQuery(request);
           return  ResponseEntity.ok(SearchQueryResponseFactory.createSearchQueryResponse(domain,keyword));
        }catch (IOException ex){
          return ResponseEntity.status(301).build();
        }
    }
}
