package ru.tonru.spring_hw5.controller;

import ru.tonru.spring_hw5.model.Person;
import ru.tonru.spring_hw5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }


    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }


    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }


    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person person) {
        person.setId(id);
        return personService.updatePerson(person);
    }


    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
