package com.sqli.chatbot.naivebayes.service;

import java.io.IOException;

public interface ClassificationNaiveBayesKeywordService {
    String getKeywordFromSearchQuery(String saerchQuery) throws IOException;
}
