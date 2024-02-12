package ru.tonru.spring_hw5;
import ru.tonru.spring_hw5.model.Person;
import ru.tonru.spring_hw5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHw5Application {

	private final PersonService personService;

	@Autowired
	public SpringHw5Application(PersonService personService) {
		this.personService = personService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHw5Application.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return args -> {
			Person person = new Person();
			person.setName("Nina");
			person.setEmail("nina@nina.com");
			person.setPhone("999999");
			personService.createPerson(person);

			Person savedPerson = personService.getPersonById(person.getId());
			System.out.println("Saved Owner: " + savedPerson);

		};
	}

}
