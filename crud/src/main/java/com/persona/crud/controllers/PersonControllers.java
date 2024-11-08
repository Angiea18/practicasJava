package com.persona.crud.controllers;


import com.persona.crud.Services.PersonServices;
import com.persona.crud.models.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "/person")

public class PersonControllers {
    private final PersonServices personServices;

    @Autowired
    public PersonControllers(PersonServices personServices) {
        this.personServices = personServices;
    }

    @GetMapping
    public ArrayList<PersonModel> getPerson() {
        return this.personServices.getPerson();
    }

    @PostMapping
    public PersonModel savePerson(@RequestBody PersonModel person) {
        return this.personServices.savePerson(person);
    }

    @GetMapping(path = "/{id}")
    public Optional<PersonModel> getPersonById(@PathVariable("id") Long id) {
        return this.personServices.getById(id);
    }

    @PutMapping(path = "/{id}")
    public PersonModel updateById(@RequestBody PersonModel request, @PathVariable Long id) {
        return this.personServices.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean itsOk = this.personServices.deletePerson(id);

        if (itsOk) {
            return "Person with Id " + " has been delete!";
        } else {
            return "Person with Id " + " not found!";
        }
    }
}
