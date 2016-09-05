package com.example.projects.example.daos;

import com.example.projects.example.entities.AnswerEntity;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mike on 9/4/2016.
 */
@org.springframework.stereotype.Repository  // The full name is used here because the name Repository is already taken in this namespace in the extends clause
// Repositories are responsible for dealing with the database; they retrieve information requested by a Service but shouldn't do any logic on the data
// Repositories are sometimes also called DAO's or Data Access Objects since their only responsibility should be to "access data" for another layer
public interface IAnswerRepository extends Repository<AnswerEntity, Integer> {  // This is Spring's magic data-jpa interface

    List<AnswerEntity> findAll();  // Spring has a method signature syntax that it parses to automatically implement Repository interfaces for you.
                                   // That means you only have to define your methods based on their syntax and they do all of the database work for you
    AnswerEntity save(AnswerEntity entity);

    Optional<AnswerEntity> findById(String id);  // In Java, Optional protects against NullPointerExceptions. It's worth looking into but not 100% necessary

    void delete(AnswerEntity entity);

}
