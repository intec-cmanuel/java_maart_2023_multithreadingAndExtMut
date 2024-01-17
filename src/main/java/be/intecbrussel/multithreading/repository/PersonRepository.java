package be.intecbrussel.multithreading.repository;

import be.intecbrussel.multithreading.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class PersonRepository {
    private List<Person> people = Collections.synchronizedList(new ArrayList<>());
//    private List<Person> people = new ArrayList<>();
    private Random monitorObject = new Random();
//    private AtomicInteger peopleCount = new AtomicInteger(0);
    private int peopleCount = 0;
    private AtomicReference<Random> atomicRandom = new AtomicReference<>(new Random());

    public void add(Person person) {

        synchronized (monitorObject) {
            people.add(person);
            peopleCount++;
        }

    }

    public List<Person> getPeople() {
        return people;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

}
