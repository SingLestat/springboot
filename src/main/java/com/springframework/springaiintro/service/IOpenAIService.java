package com.springframework.springaiintro.service;

import com.springframework.springaiintro.model.Answer;
import com.springframework.springaiintro.model.GetCapitalRequest;
import com.springframework.springaiintro.model.Question;

public interface IOpenAIService {
    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
