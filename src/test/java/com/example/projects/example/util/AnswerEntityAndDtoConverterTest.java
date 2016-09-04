package com.example.projects.example.util;

import com.example.projects.example.BaseTest;
import com.example.projects.example.dtos.outbound.AnswerDto;
import com.example.projects.example.entities.AnswerEntity;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Mike on 9/4/2016.
 */
public class AnswerEntityAndDtoConverterTest extends BaseTest {

    private static final int FIRST_PARAM = 2;
    private static final int SECOND_PARAM = 4;
    private static final int VALUE = 6;
    private static final Operation OPERATION = Operation.Add;

    @Test
    public void convertToDtoUnitTest() throws Exception {
        AnswerEntity answerEntity = new AnswerEntity(FIRST_PARAM, SECOND_PARAM, VALUE, OPERATION);
        AnswerDto actual = AnswerEntityAndDtoConverter.convertToDto(answerEntity);
        AnswerDto expected = new AnswerDto(FIRST_PARAM, SECOND_PARAM, VALUE, OPERATION);

        assertThat(actual.getFirstParam()).isEqualTo(expected.getFirstParam());
        assertThat(actual.getSecondParam()).isEqualTo(expected.getSecondParam());
        assertThat(actual.getValue()).isEqualTo(expected.getValue());
        assertThat(actual.getOperation()).isEqualTo(expected.getOperation());
    }

    @Test
    public void convertToEntityUnitTest() throws Exception {
        AnswerDto answerDto = new AnswerDto(FIRST_PARAM, SECOND_PARAM, VALUE, OPERATION);
        AnswerEntity actual = AnswerEntityAndDtoConverter.convertToEntity(answerDto);
        AnswerEntity expected = new AnswerEntity(FIRST_PARAM, SECOND_PARAM, VALUE, OPERATION);

        assertThat(actual.getFirstParam()).isEqualTo(expected.getFirstParam());
        assertThat(actual.getSecondParam()).isEqualTo(expected.getSecondParam());
        assertThat(actual.getValue()).isEqualTo(expected.getValue());
        assertThat(actual.getOperation()).isEqualTo(expected.getOperation());
    }

}
