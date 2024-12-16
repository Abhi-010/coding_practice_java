package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>() ;

        employeeList.add(new Employee(25,"Abhi",1234, 25000));
        employeeList.add(new Employee(35,"Buwan",1234, 30000));
        employeeList.add(new Employee(45,"Chetan",1234, 45000));
        employeeList.add(new Employee(55,"Durgesh",1234, 55000));
        employeeList.add(new Employee(55,"Durgesh",1234, 55000));

        /*
        1. map -- takes a Function<T,R> -- R apply(T t)
        2. filter -- takes predicate  boolean test(T t)
        3. sorted
        4. distinct
        5. peek
        6. limit
        7. skip
         */

        /*
        1. forEach - takes consumer - void accept(T t)
        2. toList() - returns a list<T>
        3.
         */

        long count = employeeList.stream().distinct().count() ;
        long count1 = employeeList.stream().count() ;
        System.out.println(count1);

        List<Employee> list = employeeList.stream().filter((employee)-> employee.getAge() > 40).toList();
        List<Employee> list1 = employeeList.stream().filter((employee)-> employee.getName().startsWith("A")).toList();
        System.out.println(list1);


        System.out.println("For Each ----");
        employeeList.stream().filter((employee)-> employee.getName().startsWith("A"))
                .forEach( (employee -> System.out.println(employee.toString())) );

        List<Integer> integerList = List.of(1,2,3,4,5) ;

        // sum of all the integers in this list :
        System.out.println("map -----");
        integerList.stream().map(i->i+1).forEach(i-> System.out.print(i + " "));

        int sum = integerList.stream().mapToInt(Integer::intValue).sum() ;

        System.out.println(sum);
    }
}
