package com.sqli.chatbot.naivebayes.util.opennlp;

import com.sqli.chatbot.naivebayes.util.dto.OpenNlpResponse;

import java.io.IOException;

public interface OpenNLPService {
    OpenNlpResponse getMostPredicatedResult(String training_file_path, String training_model_path, String searchQuery) throws IOException;
}
