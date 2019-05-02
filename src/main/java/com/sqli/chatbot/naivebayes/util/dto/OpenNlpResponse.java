package com.sqli.chatbot.naivebayes.util.dto;

public class OpenNlpResponse {
    private String domain;
    private double prob;

    public OpenNlpResponse(String domain, double prob) {
        this.domain = domain;
        this.prob = prob;
    }

    public OpenNlpResponse() {
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }
}
