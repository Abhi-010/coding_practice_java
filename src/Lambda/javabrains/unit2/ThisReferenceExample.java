package Lambda.javabrains.unit2;

public class ThisReferenceExample {

    public static void doProcess(int i , Process p){
        p.process(i);
    }
    public static void main(String[] args) {
        doProcess(1 , new Process(){
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is this reference in Inner class";
            }
        });

        System.out.println("Lambda Function : ");
        doProcess(1,i-> {
            System.out.println(i);
        }
        );
    }
}

