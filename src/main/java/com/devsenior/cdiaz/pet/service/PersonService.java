package com.devsenior.cdiaz.pet.service;

import java.util.List;

import com.devsenior.cdiaz.pet.model.dto.PersonDto;

public interface PersonService {
    List<PersonDto> getAll();

    PersonDto create(PersonDto person);
}
