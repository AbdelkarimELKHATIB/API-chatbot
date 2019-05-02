package com.sqli.chatbot.naivebayes.util.factory;

import com.sqli.chatbot.naivebayes.util.dto.SearchQueryResponse;

public class SearchQueryResponseFactory {
    private SearchQueryResponseFactory(){}
    public static SearchQueryResponse createSearchQueryResponse(String domain,String keyword){
        return new SearchQueryResponse(domain,keyword);
    }
}
