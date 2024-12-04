package Lambda.javabrains.unit3;

import Lambda.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dicknes", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        people.forEach(System.out::println);
    }
}
