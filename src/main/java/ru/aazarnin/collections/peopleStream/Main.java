package ru.aazarnin.collections.peopleStream;

import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("James Bond", 35, Gender.MALE));
        people.add(new Person("Alina Smith", 25, Gender.FEMALE));
        people.add(new Person("Zelda Brown", 120, Gender.FEMALE));
        people.add(new Person("Alex Box", 14, Gender.MALE));

        // filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        // sort
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        sortedByAge.forEach(System.out::println);

        // all match/
        // anyMatch(if there's only one matching the condition)/
        // noneMatch(if there isn't anyone matching the condition)
        boolean matchLessThanFourty = people.stream()
                .allMatch(person -> person.getAge() < 40);
        System.out.println(matchLessThanFourty);

        // min/ max
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // max number from array
        int [] numbers = {1,3,8,4,9,2};
        OptionalInt maxNumber = Arrays.stream(numbers).max();
        System.out.println(maxNumber.getAsInt());
        Assert.assertEquals(9, maxNumber.getAsInt());

        // group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

        // get the name of the oldest female
        Optional<String> nameOfTheOldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        nameOfTheOldestFemale.ifPresent(System.out::println);
    }

}
