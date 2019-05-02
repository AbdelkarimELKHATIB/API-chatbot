package com.sqli.chatbot.naivebayes.service;

import java.io.IOException;

public interface ClassificationNaiveBayesDomainService {
    String getDomainFromSearchQuery(String saerchQuery) throws IOException;
}
