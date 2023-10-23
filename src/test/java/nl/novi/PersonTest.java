package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person father;
    Person mother;
    Person me;
    Person sister;
    Pet Dog;
    Person nephew;
    Person grandMother;

    @BeforeEach
    void setUp() {
        father = new Person("Frans", "Janwillem", "Heideman", 63, 'm');
        me = new Person("Jeffrey", "Heideman", 27, 'm');
        sister = new Person("Sylvia", "Heideman", 29, 'f');
        mother = new Person("Marijke", "Versteeg", 62, 'f');
        Dog = new Pet("Dog", 2, "Malteser");
        nephew = new Person("Sven", "Van der Poel", 4, 'm');
        grandMother = new Person("Jakoba", "Heideman", 90, 'f');




    }

    @Test
    void getChildren() {
        List<Person> children = new ArrayList<>();
        children.add(me);
        children.add(sister);
        father.setChildren(children);
        assertEquals(children, father.getChildren());

    }

    @Test
    void setChildren() {
        List<Person> children = new ArrayList<>();
        children.add(me);
        children.add(sister);
        father.setChildren(children);
        assertEquals(children, father.getChildren());
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
        int getAge = father.getAge();
        assertEquals(63, getAge);
    }

    @Test
    void setAge() {
        father.setAge(64);
        int getAge = father.getAge();
        assertEquals(64, getAge);
    }

    @Test
    void getSex() {
        char getSex = father.getSex();
        assertEquals('m', getSex);
    }

    @Test
    void setSex() {
        father.setSex('f');
        char getSex = father.getSex();
        assertEquals('f', getSex);
    }

    @Test
    void getMother() {
        mother.setMother(mother);
        assertEquals(mother, mother);
    }

    @Test
    void setMother() {
        mother.setMother(mother);
        Person getMother = mother.getMother();
        assertEquals(mother, getMother);
    }

    @Test
    void getFather() {
        father.setFather(father);
        assertEquals(father, father);
    }

    @Test
    void setFather() {
        father.setFather(father);
        Person getFather = father.getFather();
        assertEquals(father, getFather);
    }

    @Test
    void getSiblings() {
        List<Person> kids = new ArrayList<>();
        kids.add(me);
        kids.add(sister);
        father.setChildren(kids);

    }

    @Test
    void setSiblings() {
        List<Person> kids = new ArrayList<>();
        kids.add(me);
        kids.add(sister);
        father.setChildren(kids);
        List<Person> getSiblings = father.getChildren();
        assertEquals(kids, getSiblings);
    }

    @Test
    void getPets() {
        List<Pet> pets = new ArrayList<>();
        pets.add(Dog);
        me.setPets(pets);
    }

    @Test
    void addParents() {
        me.addParents(father, mother, me);
        assertEquals(father, me.getFather());
        assertEquals(mother, me.getMother());

    }

    @Test
    void addChildToChildren() {
        List<Person> children = new ArrayList<>();
        children.add(sister);
        sister.addChildToChildren(sister, nephew);
    }

    @Test
    void addPet() {
        me.addPet(me, Dog);
        assertEquals(Dog, me.getPets().get(0));
    }

    @Test
    void addSibling() {
        List<Person> siblings = new ArrayList<>();
        siblings.add(sister);
        father.setChildren(siblings);
        assertEquals(siblings, father.getChildren());
    }

    @Test
    void getGrandChildren() {
        List<Person> grandChildren = new ArrayList<>();
        grandChildren.add(nephew);

        sister.addChildToChildren(sister, nephew);
        father.addChildToChildren(father, sister);
        List<Person> list = father.getGrandChildren(father);
        assertEquals(grandChildren, list);

    }
}