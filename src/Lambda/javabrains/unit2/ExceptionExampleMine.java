package Lambda.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionExampleMine {
    public static void main(String[] args) {

        int[] someNumbers = new int[]{3,4,5,6,7} ;
        int key = 0 ;

        process(someNumbers,key,(k,v)-> System.out.println(k/v));
    }

    public static void process(int[] someNumbers , int key, BiConsumer<Integer,Integer> consumer){
        for(int i : someNumbers){
            try {
                consumer.accept(i,key);
            }
            catch (ArithmeticException exception){
                System.out.println("caught exception divided by zero");
            }
        }
    }
}
