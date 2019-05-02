package com.sqli.chatbot.naivebayes.service.impl;

import com.sqli.chatbot.naivebayes.service.ClassificationNaiveBayesKeywordService;
import com.sqli.chatbot.naivebayes.util.constantes.Constant;
import com.sqli.chatbot.naivebayes.util.dto.OpenNlpResponse;
import com.sqli.chatbot.naivebayes.util.opennlp.OpenNLPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DefaultClassificationNativeBayesKeywordService implements ClassificationNaiveBayesKeywordService {
    @Autowired
    private OpenNLPService nlpService;

    @Override
    public String getKeywordFromSearchQuery(String saerchQuery) throws IOException {
        OpenNlpResponse response = nlpService.getMostPredicatedResult(Constant.TRAINING_KEYWORD_FILE_PATH, Constant.TRAINING_KEYWORD_MODEL_PATH, saerchQuery);
        return this.getKeyword(response);
    }

    private String getKeyword(OpenNlpResponse nlpResponse) {
        return nlpResponse.getProb() > 0.5 ? nlpResponse.getDomain()+" "+nlpResponse.getProb(): "None" + nlpResponse.getProb();
    }
}
