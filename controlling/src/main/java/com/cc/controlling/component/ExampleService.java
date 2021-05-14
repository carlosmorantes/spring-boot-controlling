package com.cc.controlling.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.controlling.model.ExampleEntity;
import com.cc.controlling.repository.ExampleRepository;
import com.cc.controlling.repository.IExample;

@Service
public class ExampleService implements IExample {

    @Autowired
    private ExampleRepository repository;

    @Override
    public void save(ExampleEntity example) {
	repository.save(example);
    }
}
