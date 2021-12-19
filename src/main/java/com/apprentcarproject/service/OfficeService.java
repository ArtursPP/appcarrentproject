package com.apprentcarproject.service;


import com.apprentcarproject.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OfficeService {

    private OfficeRepository officeRepository;
    private ExampleMatcher officeMatcher;


    @PostConstruct
    private void init() {
        officeMatcher = ExampleMatcher.matchingAll()
                .withIgnoreNullValues()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase();
    }


    @Autowired
    public OfficeService(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }
}
