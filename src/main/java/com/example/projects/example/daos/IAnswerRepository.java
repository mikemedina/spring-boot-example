package com.example.projects.example.daos;

import com.example.projects.example.entities.AnswerEntity;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mike on 9/4/2016.
 */
@org.springframework.stereotype.Repository
public interface IAnswerRepository extends Repository<AnswerEntity, Integer> {

    List<AnswerEntity> findAll();

    AnswerEntity save(AnswerEntity entity);

    Optional<AnswerEntity> findById(String id);

    void delete(AnswerEntity entity);

}
