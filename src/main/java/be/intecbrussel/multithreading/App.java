package be.intecbrussel.multithreading;

import be.intecbrussel.multithreading.repository.PersonRepository;
import be.intecbrussel.multithreading.thread.MyRunnable;

public class App {
    public static final int times = 2000000000;

    public static void main(String[] args) {
//        runMethod(() -> thread(), "thread method");
        runMethod(() -> new MyRunnable(null).run(), "parallelstream");
    }

    public static void runMethod(Runnable runnable, String description) {
        long start = System.nanoTime();
        runnable.run();
        long end = System.nanoTime();
        double msDiff = ((end - start) / 1_000_000.0);
        System.out.println(description + ": " + msDiff + " milliseconds");
    }

    public static void thread() {
        PersonRepository personRepository = new PersonRepository();

        Thread thread1 = new Thread(new MyRunnable(personRepository));
        Thread thread2 = new Thread(new MyRunnable(personRepository));
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(personRepository.getPeople().size());
        System.out.println(personRepository.getPeopleCount());
    }

}
