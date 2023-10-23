package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    Pet dog;
    Person owner;

    @BeforeEach
    void setUp() {
        dog = new Pet("Max", 2, "Malteser");
        owner = new Person("Jeffrey", "Heideman", 27, 'm');
    }

    @Test
    void getName() {
        String getName = dog.getName();
        assertEquals("Max", getName);
    }

    @Test
    void getAge() {
        int getAge = dog.getAge();
        assertEquals(2, getAge);
    }

    @Test
    void getSpecies() {
        String getSpecies = dog.getSpecies();
        assertEquals("Malteser", getSpecies);
    }

    @Test
    void getOwner() {
        Person getOwner = dog.getOwner();
        assertEquals(null, getOwner);

    }

    @Test
    void setOwner() {
        dog.setOwner(owner);
        Person getOwner = dog.getOwner();
        assertEquals(owner, getOwner);
    }
}