package abstract_class_interfaces.interfaces;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());

       // OrbitEarth.log("Testing : " + new Jet());

        orbit(new Satellite());
    }

    public static void inFlight(FlightEnabled flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();

        flightEnabled.transition(FlightStages.LAUNCH) ;

        if(flightEnabled instanceof Trackable tracked){
            tracked.track();
        }
        flightEnabled.land();
    }

    public static void orbit(OrbitEarth flightEnabled){
        flightEnabled.takeOff();
        flightEnabled.fly();

        flightEnabled.land();
    }
}
