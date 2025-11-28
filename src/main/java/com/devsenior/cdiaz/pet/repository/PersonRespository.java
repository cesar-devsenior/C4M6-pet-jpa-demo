package com.devsenior.cdiaz.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.cdiaz.pet.model.entity.Person;

public interface PersonRespository extends JpaRepository<Person, Long> {
    
}
