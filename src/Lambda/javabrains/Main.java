package Lambda.javabrains;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter() ;
        greeter.greet(new HelloWorldGreetings());
    }
}
