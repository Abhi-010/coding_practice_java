package Lambda.javabrains.unit3;

import Lambda.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dicknes", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //printPeopleConditionally(people, p -> true, p-> System.out.println(p));
        printPeopleConditionally(people, p -> true, System.out::println);
    }

    private static void printPeopleConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person person : people){
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }
    public static void printMessage(){
        System.out.println("hello");
    }
}
