package com.example.projects.example.services;

import com.example.projects.example.daos.IAnswerRepository;
import com.example.projects.example.dtos.inbound.MathDto;
import com.example.projects.example.dtos.outbound.AnswerDto;
import com.example.projects.example.entities.AnswerEntity;
import com.example.projects.example.exceptions.MathFailedException;
import com.example.projects.example.util.AnswerEntityAndDtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mike on 9/3/2016.
 */
@Service
public class MathService {

    private final IAnswerRepository answerRepo;

    public MathService(IAnswerRepository answerRepo) {
        this.answerRepo = answerRepo;
    }

    public List<AnswerDto> listAll() {
        List<AnswerEntity> answerEntities = answerRepo.findAll();
        return answerEntities
                .stream()
                .map(AnswerEntityAndDtoConverter::convertToDto)
                .collect(Collectors.toList());
    }

    public AnswerDto calculateAnswer(MathDto mathDto) {
        AnswerEntity answerEntity = getAnswerEntity(mathDto);
        answerRepo.save(answerEntity);

        AnswerDto answerDto = AnswerEntityAndDtoConverter.convertToDto(answerEntity);
        return answerDto;
    }

    AnswerEntity getAnswerEntity(MathDto mathDto) {
        AnswerEntity answer = new AnswerEntity(mathDto.getFirstParam(), mathDto.getSecondParam(), 0, mathDto.getOperation());
        switch (mathDto.getOperation()) {
            case Add:
                answer.setValue(answer.getFirstParam() + answer.getSecondParam());
                break;
            case Subtract:
                answer.setValue(answer.getFirstParam() - answer.getSecondParam());
                break;
            case Multiply:
                answer.setValue(answer.getFirstParam() * answer.getSecondParam());
                break;
            default:
                throw new MathFailedException("There was a problem calculating the answer");
        }

        return answer;
    }

}
