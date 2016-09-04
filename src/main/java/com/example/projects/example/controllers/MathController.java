package com.example.projects.example.controllers;

import com.example.projects.example.dtos.inbound.MathDto;
import com.example.projects.example.dtos.outbound.AnswerDto;
import com.example.projects.example.services.MathService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mike on 9/3/2016.
 */
@RestController
public class MathController {

    private MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<AnswerDto> newReminder() {
        return mathService.listAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public AnswerDto newReminder(@RequestBody MathDto mathDto) {
        return mathService.calculateAnswer(mathDto);
    }

}
