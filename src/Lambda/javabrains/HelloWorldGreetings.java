package Lambda.javabrains;

public class HelloWorldGreetings implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello World ");
    }
}
