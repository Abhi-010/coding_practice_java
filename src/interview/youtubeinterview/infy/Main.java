package interview.youtubeinterview.infy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Question 1 : Add all these skills in one list
        // Question 2 : filter out which skills starting with S

        List<List<String>> skills = Arrays.asList(   
                Arrays.asList("Java","Spring","Spring Boot"),
                Arrays.asList("React","Angula","Java Script"),
                Arrays.asList("MySQL","PostgreSQL","Oracle")
        );





        List<String> listOfSkills = new ArrayList<>();
        System.out.println(skills.size());

        for(List<String> list : skills){
            listOfSkills.addAll(list) ;
        }

        System.out.println("One list");
        for(String s : listOfSkills){
            System.out.print(s + " ");
        }
    }
}
