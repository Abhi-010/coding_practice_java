package Lambda.javabrains.unit1;

public class RunnableExample {
    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running my Thread");
            }
        });

        myThread.start();

        Thread myLambdaThread =
                new Thread(()-> System.out.println("Running Lambda Thread"));

        myLambdaThread.start();
    }
}
