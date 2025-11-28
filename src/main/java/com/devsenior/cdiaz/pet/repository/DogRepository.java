package com.devsenior.cdiaz.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.cdiaz.pet.model.entity.Dog;
import com.devsenior.cdiaz.pet.model.entity.Dog.DogId;

public interface DogRepository extends JpaRepository<Dog, DogId> {
    
}
