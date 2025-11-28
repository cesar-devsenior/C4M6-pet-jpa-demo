package com.devsenior.cdiaz.pet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.cdiaz.pet.model.dto.PersonDto;
import com.devsenior.cdiaz.pet.model.entity.Person;
import com.devsenior.cdiaz.pet.repository.PersonRespository;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRespository personRespository;

    public PersonServiceImpl(PersonRespository personRespository) {
        this.personRespository = personRespository;
    }

    @Override
    public List<PersonDto> getAll() {
        return personRespository.findAll().stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public PersonDto create(PersonDto personDto) {
        var entity = toEntity(personDto);

        var newEntity = personRespository.save(entity);

        var response = toDto(newEntity);

        return response;
    }

    private Person toEntity(PersonDto personDto) {
        var entity = new Person();
        entity.setId(personDto.getId());
        entity.setName(personDto.getName());
        entity.setPhone(personDto.getPhone());
        entity.setEmail(personDto.getEmail());
        entity.setSalary(personDto.getSalary());
        return entity;
    }

    private PersonDto toDto(Person p) {
        var dto = new PersonDto();
        dto.setId(p.getId());
        dto.setName(p.getName());
        dto.setPhone(p.getPhone());
        dto.setEmail(p.getEmail());
        dto.setSalary(p.getSalary());
        return dto;
    }

}
