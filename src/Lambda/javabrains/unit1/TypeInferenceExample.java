package Lambda.javabrains.unit1;

public class TypeInferenceExample {
    public static void main(String[] args) {

        StringLengthLambda myLambda = s-> s.length() ;
        System.out.println(myLambda.getLength("Hello World"));
    }
}

interface StringLengthLambda{
    int getLength(String s) ;
}
