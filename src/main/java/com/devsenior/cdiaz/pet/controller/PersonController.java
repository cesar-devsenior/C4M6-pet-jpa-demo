package com.devsenior.cdiaz.pet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.cdiaz.pet.model.dto.PersonDto;
import com.devsenior.cdiaz.pet.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDto> getAllPeople() {
        return personService.getAll();
    }

    @PostMapping
    public PersonDto createPerson(@RequestBody PersonDto info) {
        return personService.create(info);
    }
    

}