package com.example.projects.example.services;

import com.example.projects.example.BaseTest;
import com.example.projects.example.daos.IAnswerRepository;
import com.example.projects.example.dtos.inbound.MathDto;
import com.example.projects.example.entities.AnswerEntity;
import com.example.projects.example.util.Operation;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by Mike on 9/4/2016.
 */
public class MathServiceTest extends BaseTest {

    private static final int FIRST_PARAM = 2;
    private static final int SECOND_PARAM = 4;
    private static final int VALUE = 6;
    private static final Operation OPERATION = Operation.Add;

    private final IAnswerRepository answerRepo = mock(IAnswerRepository.class);  // This is called "dependency mocking"

    private final MathService mathService = new MathService(answerRepo);

    @Test  // Necessary to get Junit magic
    public void getAnswerEntityTest() throws Exception {
        MathDto mathDto = new MathDto(FIRST_PARAM, SECOND_PARAM, OPERATION);
        AnswerEntity actual = mathService.getAnswerEntity(mathDto);
        AnswerEntity expected = new AnswerEntity(FIRST_PARAM, SECOND_PARAM, VALUE, OPERATION);

        assertThat(actual.getFirstParam()).isEqualTo(expected.getFirstParam());
        assertThat(actual.getSecondParam()).isEqualTo(expected.getSecondParam());
        assertThat(actual.getValue()).isEqualTo(expected.getValue());
        assertThat(actual.getOperation()).isEqualTo(expected.getOperation());
    }

}
