package com.cc.controlling.repository;

import org.springframework.data.repository.CrudRepository;

import com.cc.controlling.model.ExampleEntity;


public interface ExampleRepository extends CrudRepository<ExampleEntity, Integer> {

}
