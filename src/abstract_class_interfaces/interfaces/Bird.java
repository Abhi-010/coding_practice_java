package abstract_class_interfaces.interfaces;

public class Bird extends Animal implements Trackable,FlightEnabled{

    @Override
    public void move() {
        System.out.println("Flaps Wings ");
    }

   @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

   @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " tracked. ");
    }
}