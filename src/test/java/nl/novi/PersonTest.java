package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person father;
    Person mother;
    Person me;

    @BeforeEach
    void setUp() {
        father = new Person("Frans", "Janwillem", "Heideman", 63, 'm');
        me = new Person("Jeffrey", "Heideman", 27, 'm');
        mother = new Person("Marijke", "Versteeg", 62, 'f');



    }

    @Test
    void getChildren() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void getName() {
        //Act
        String getName = father.getName();
        //Assert
        assertEquals("Frans", getName);
    }

    @Test
    void setName() {
        father.setName("Hans");
        String getName = father.getName();
        assertEquals("Hans", getName);
    }

    @Test
    void getMiddleName() {
        String getMiddleName = father.getMiddleName();
        assertEquals("Janwillem", getMiddleName);
    }

    @Test
    void setMiddleName() {
        father.setMiddleName("JanKees");
        String getMiddleName = father.getMiddleName();
        assertEquals("JanKees", getMiddleName);
    }

    @Test
    void getLastName() {
        String getLastName = father.getLastName();
        assertEquals("Heideman", getLastName);

    }

    @Test
    void setLastName() {
        father.setLastName("Van Nistelrooij");
        String getLastName = father.getLastName();
        assertEquals("Van Nistelrooij", getLastName);
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }

    @Test
    void addParents() {
        me.addParents(father, mother, me);
        assertEquals(father, me.getFather());
        assertEquals(mother, me.getMother());

    }

    @Test
    void addChildToChildren() {
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getGrandChildren() {
    }
}