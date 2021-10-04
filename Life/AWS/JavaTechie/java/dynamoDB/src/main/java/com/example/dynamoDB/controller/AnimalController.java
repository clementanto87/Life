package com.example.dynamoDB.controller;

import com.example.dynamoDB.entity.Animal;
import com.example.dynamoDB.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimalController {

    @Autowired
    private PersonRepository personRepository;


    @GetMapping("/")
    public String test() {
        return "works";
    }

    @PostMapping("/animal")
    public Animal saveAnimal(@RequestBody Animal animal) {
        return personRepository.saveAnimal(animal);
    }

    @GetMapping("/animal/{personId}")
    public Animal getAnimalById(@PathVariable String personId) {
        return personRepository.getAnimalById(personId);
    }

    @DeleteMapping("/animal")
    public String delete(@RequestBody Animal animal) {
        return personRepository.deleteAnimal(animal);
    }

    @PutMapping("/animal")
    public String update(@RequestBody Animal animal) {
        return personRepository.updateAnimal(animal);
    }
}
