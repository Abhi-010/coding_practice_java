package Lambda.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 0;
        process(someNumbers,key,wrapperLambda((v,k)-> System.out.println(v/k)));
    }

    private static void process(int[] n, int key, BiConsumer<Integer,Integer> consumer){
        for(int i : n){
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (v,k)->{
            try{
                consumer.accept(v,k);
            }
            catch (ArithmeticException e){
                System.out.println("Exception caught in Lambda");
            }
        };
    }
}
