package be.intecbrussel.multithreading.thread;

import be.intecbrussel.multithreading.App;
import be.intecbrussel.multithreading.model.Person;
import be.intecbrussel.multithreading.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyRunnable implements Runnable {
    private PersonRepository personRepository;

    public MyRunnable(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 2000; i++) {
//            Person person = new Person("Eddy", new Random().nextInt());
//            personRepository.add(person);
//        }

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        List<Integer> resultList;

        final int factor = 2;

        resultList = integers.parallelStream()
                .map(number -> number * factor)
                .toList();

        System.out.println(resultList);
        System.out.println(resultList.size());
    }
}
