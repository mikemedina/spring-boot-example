package com.example.projects.example.util;

import com.example.projects.example.dtos.outbound.AnswerDto;
import com.example.projects.example.entities.AnswerEntity;

/**
 * Created by Mike on 9/4/2016.
 */
public class AnswerEntityAndDtoConverter {

    public static AnswerDto convertToDto(AnswerEntity answerEntity) {
        return new AnswerDto(answerEntity.getFirstParam(), answerEntity.getSecondParam(), answerEntity.getValue(), answerEntity.getOperation());
    }

    public static AnswerEntity convertToEntity(AnswerDto answerDto) {
        return new AnswerEntity(answerDto.getFirstParam(), answerDto.getSecondParam(), answerDto.getValue(), answerDto.getOperation());
    }

}
