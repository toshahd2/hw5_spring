package ru.tonru.spring_hw5.service;

import ru.tonru.spring_hw5.model.Person;
import ru.tonru.spring_hw5.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;


@Service
public class PersonService {
    private final PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }


    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }


    public Person createPerson(Person person) {
        return personRepository.save(person);
    }


    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }


    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
