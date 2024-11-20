package Lambda.javabrains.unit2;

import Lambda.javabrains.lambda_exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise1_Java8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dicknes", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        // sort the list by last name
        Collections.sort(people, ( o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));


        // create a method that prints all the methods of the list
        printPeople(people);

        // create a method that print all the people that has last name beginning with C.
        // printPeopleConditionally - input people, condition.
        // based on that condition people will get printed

        printPeopleConditionally(people, ( p)-> p.getLastName().startsWith("C"), p-> System.out.println(p));

        printPeopleConditionally(people, ( p)-> p.getLastName().startsWith("A"),p-> System.out.println(p));
    }


    private static void printPeopleConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person person : people){
            if(predicate.test(person)){
               consumer.accept(person);
            }
        }
    }

    private static void printPeople(List<Person> people) {
        for(Person p : people){
            System.out.println(p);
        }
    }

}

