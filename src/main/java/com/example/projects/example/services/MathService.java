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
@Service  // This annotation registers the Service with Spring
// A Controller directs traffic to a Service, the Service requests required information from a DAO (Data Access Object), then performs the business logic on it
public class MathService {

    private final IAnswerRepository answerRepo;  // This is the DAO or Repo that this Service will be getting it's data from

    public MathService(IAnswerRepository answerRepo) {  // The repo gets assigned it's value through "Constructor Injection" which is a type of "Dependency Injection"
        this.answerRepo = answerRepo;
    }

    public List<AnswerDto> listAll() {  // This method gets data from the DAO and then reformats it for the Controller. This is typical work for a Service.
        List<AnswerEntity> answerEntities = answerRepo.findAll();
        return answerEntities
                .stream()  // These few lines use Java 8's new "functional interfaces"; Java 8 also introduced Lambdas
                .map(AnswerEntityAndDtoConverter::convertToDto)
                .collect(Collectors.toList());
    }

    public AnswerDto calculateAnswer(MathDto mathDto) {
        AnswerEntity answerEntity = getAnswerEntity(mathDto);
        answerRepo.save(answerEntity);

        AnswerDto answerDto = AnswerEntityAndDtoConverter.convertToDto(answerEntity);  // This value could just be returned but I'm learning how much more readable
        return answerDto;                                                              // code can be when you stop taking every shortcut and try to be more expressive
    }

    AnswerEntity getAnswerEntity(MathDto mathDto) {
        AnswerEntity answer = new AnswerEntity(mathDto.getFirstParam(), mathDto.getSecondParam(), 0, mathDto.getOperation());
        switch (mathDto.getOperation()) {  // Switch statements work really well hand-in-hand with Enums
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
