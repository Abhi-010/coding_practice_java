package collections;

import java.util.HashMap;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        Customer c1 = new Customer("abhi","deoghar");
        Customer c2 = new Customer("abhi","deoghar");

        HashSet<Customer> set = new HashSet<>();

        set.add(c1) ;
        set.add(c2) ;

        for(Customer c : set){
            System.out.println(c);
        }

    }
}
