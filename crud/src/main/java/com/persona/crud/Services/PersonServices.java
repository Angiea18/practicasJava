package com.persona.crud.Services;


import com.persona.crud.Repository.PersonRepository;
import com.persona.crud.models.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonServices {

    @Autowired
    PersonRepository personRepository;

    public ArrayList<PersonModel> getPerson() {
        return (ArrayList<PersonModel>)  personRepository.findAll();
    }

    public PersonModel savePerson(PersonModel person) {
        return personRepository.save(person);
    }

    public Optional<PersonModel> getById(Long id) {
        return personRepository.findById(id);
    }

    public PersonModel updateById(PersonModel request, Long id) {
        PersonModel person = personRepository.findById(id).get();

        person.setName(request.getName());
        person.setLastName(request.getLastName());
        person.setAge(request.getAge());
        person.setDni(request.getDni());
        person.setGender(request.getGender());
        person.setEmail(request.getEmail());
        personRepository.save(person);

        return person;
    }

    public Boolean deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
