package com.sqli.chatbot.naivebayes.dto;

import java.io.Serializable;

public class SearchQueryResponse implements Serializable {
    private String domain;
    public SearchQueryResponse(String domain) {
        this.domain = domain;
    }
    public SearchQueryResponse(){}

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
