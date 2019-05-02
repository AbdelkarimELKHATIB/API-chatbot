package com.sqli.chatbot.naivebayes.util.dto;

import java.io.Serializable;

public class SearchQueryResponse implements Serializable {
    private String domain;
    private String keyword;

    public SearchQueryResponse(String domain, String keyword) {
        this.domain = domain;
        this.keyword = keyword;
    }

    public SearchQueryResponse(){}

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
