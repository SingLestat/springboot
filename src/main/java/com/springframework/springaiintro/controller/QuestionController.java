package com.springframework.springaiintro.controller;

import com.springframework.springaiintro.model.Answer;
import com.springframework.springaiintro.model.GetCapitalRequest;
import com.springframework.springaiintro.model.Question;
import com.springframework.springaiintro.service.IOpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final IOpenAIService openAIService;

    public QuestionController(IOpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

    @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapital(getCapitalRequest);
    }
}
