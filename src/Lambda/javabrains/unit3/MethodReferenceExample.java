package Lambda.javabrains.unit3;

public class MethodReferenceExample {
    public static void main(String[] args) {

        //Thread thread = new Thread(()-> printMessage()) ;
        Thread thread = new Thread(MethodReferenceExample::printMessage) ;
        thread.start();
    }

    public static void printMessage(){
        System.out.println("hello");
        System.out.println("hey you are ");
        System.out.println(5*45*90);
    }
}
