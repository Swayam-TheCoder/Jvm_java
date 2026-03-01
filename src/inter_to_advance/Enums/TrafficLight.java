package inter_to_advance.Enums;

public enum TrafficLight {
    RED("STOP"), GREEN("GO"), YELLOW("WAIT");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
}
