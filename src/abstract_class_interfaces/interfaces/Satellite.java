package abstract_class_interfaces.interfaces;

public class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED ;

    @Override
    public void achieveOrbit() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}
