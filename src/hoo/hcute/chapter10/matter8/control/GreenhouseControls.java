package hoo.hcute.chapter10.matter8.control;

public class GreenhouseControls extends Controller {

    private boolean light = false;

    public class LightOn extends Event{
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "light is on";
        }
    }


    public class LightOff extends Event{

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "light is off";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event{
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "water is on";
        }
    }

    public class WaterOff extends Event{
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event{

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing";
        }
    }

    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e: eventList){
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList
                 ) {
                e.start();
                addEvent(e);
            }
        }

        @Override
        public String toString() {
            return "Restart System";
        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}
