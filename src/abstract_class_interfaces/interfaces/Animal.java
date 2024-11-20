package abstract_class_interfaces.interfaces;

interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date() ;
        System.out.println(today + description);
    }

    private void logStages(FlightStages flightStages, String description){
        description = flightStages + description ;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStages(stage,"Beginning Transition to " + nextStage );
        return nextStage;
    }
}


enum FlightStages implements Trackable{
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION,
    ;

    @Override
    public void track() {

    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values() ;
        return allStages[(ordinal()+1)%allStages.length] ;
    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface FlightEnabled{
    void takeOff() ;
    void land();
    void fly() ;

    default FlightStages transition(FlightStages stage){
        FlightStages nextStage = stage.getNextStage() ;
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage ;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move() ;
}
