package com.david;

import com.david.model.Person;
import com.david.service.IPersonService;
import com.david.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PersonServiceTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Keith", "Moon", "mail@mail.com.br", "rua tal numero 0", "male");
    }

    @DisplayName("When creating a person with succes should return a person object")
    @Test
    void testCreatingPersonReturnsPersonObject() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertNotNull(actual, "createPerson() shouldn't have returned null");

    }

    @DisplayName("When creating a person with succes should return a person object with a first name")
    @Test
    void testCreatingPersonReturnsPersonObjectWithFirstName() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertEquals(person.getFirstName(), actual.getFirstName());
    }

    @DisplayName("When creating a person with succes should return a person object with a last name")
    @Test
    void testCreatingPersonReturnsPersonObjectWithLasstName() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertEquals(person.getLastName(), actual.getLastName());
    }

    @DisplayName("When creating a person with succes should return a person object with a address")
    @Test
    void testCreatingPersonReturnsPersonObjectWithAddress() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertEquals(person.getAddress(), actual.getAddress());
    }

    @DisplayName("When creating a person with succes should return a person object with a gender")
    @Test
    void testCreatingPersonReturnsPersonObjectWithGender() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertEquals(person.getGender(), actual.getGender());
    }

    @DisplayName("When creating a person with succes should return a person object with a email")
    @Test
    void testCreatingPersonReturnsPersonObjectWithEmail() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertEquals(person.getEmail(), actual.getEmail());
    }

}
