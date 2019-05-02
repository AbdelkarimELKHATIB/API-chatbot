package com.sqli.chatbot.naivebayes.dto;

import java.io.Serializable;

public class SearchQueryRequest implements Serializable {
    private String query;

    public SearchQueryRequest(String query) {
        this.query = query;
    }
    public SearchQueryRequest(){}

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
