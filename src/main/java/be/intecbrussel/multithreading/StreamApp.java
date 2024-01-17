package be.intecbrussel.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
//        List<Integer> resultList = new ArrayList<>();
//
//        final int factor = 2;
//
//        integers.parallelStream()
//                .map(number -> number * factor)
//                .forEach(resultList::add);
//
//        System.out.println(resultList);
//        System.out.println(resultList.size());




        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> resultList = modifyList(numbers);
        System.out.println(numbers);
        System.out.println(resultList);

    }

    private static List<Integer> modifyList(List<Integer> list) {
        List<Integer> resultList = list.stream()
                .filter(number -> list.indexOf(number) != 4)
                .toList();

        return resultList;
    }
}
