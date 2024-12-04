package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // 1. Create a set to hold intermediate results

        Set<String> set = new HashSet<>();

        //List<String> result = listOfLists.stream().flatMap().forEach();
    }
}
