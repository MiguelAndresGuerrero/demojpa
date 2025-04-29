package com.adrian.demojpa.application.service;

import java.util.List;


import com.adrian.demojpa.domain.Person;

public interface PersonService {
    public List<Person> findAllByFilter(String filter, String value);
}
