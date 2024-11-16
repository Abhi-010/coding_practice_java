import citiBank.Student;

public class Main {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abbc";

        if(a == b){
            System.out.println("equals object");
        }

        if(a.equals(b)){
            System.out.println("equals object");
        }

//        A obj = new B();
//        obj.doSomething();
//
//        A obj1 = new A();
//        obj1.doSomething();
//        B b = new B();
//        b.doSomething();

    }
}

class A{
      void doSomething(){
        System.out.println("A's class method");
    }
}
class B extends A{
      void doSomething(int a){
        System.out.println("B's class method");
    }
}
