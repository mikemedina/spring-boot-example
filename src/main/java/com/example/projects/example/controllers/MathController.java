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
@RestController  // This annotation registers the Controller with Spring; Controllers are responsible for "directing traffic" typically to a corresponding Service
public class MathController {

    private MathService mathService;  // Fields like this get populated through "Constructor injection"

    public MathController(MathService mathService) {
        this.mathService = mathService;  // Spring creates it's own "context" at launch and uses a single instance of the "injected" object everywhere
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)  // The mapping is the path after the url i.e. http://localhost:8080/*mapping*
    public List<AnswerDto> newReminder() {  // Spring uses a "MappingJackson2HttpMessageConverter" class to map a Java data structure to JSON in the response
        return mathService.listAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)  // This method maps to root i.e. http://localhost:8080/
    public AnswerDto newReminder(@RequestBody MathDto mathDto) {
        return mathService.calculateAnswer(mathDto);
    }

}
