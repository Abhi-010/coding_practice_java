package Lambda.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1_Java7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dicknes", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        // sort the list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        // create a method that prints all the methods of the list
        printPeople(people);

        // create a method that print all the people that has last name beginning with C.
        // printPeopleConditionally - input people, condition.
        // based on that condition people will get printed

        printPeopleConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });
    }


    private static void printPeopleConditionally(List<Person> people, Condition condition) {
       for(Person person : people){
           if(condition.test(person)){
               System.out.println(person);
           }
       }
    }

    private static void printPeople(List<Person> people) {
        for(Person p : people){
            System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}
