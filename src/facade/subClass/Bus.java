package facade.subClass;

public class Bus implements Transport{

    private String name = "bus";
    private int timeOnTransport;

    public Bus(int timeOnTransport) {
        this.timeOnTransport = timeOnTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeOnTransport() {
        return timeOnTransport;
    }

    public void setTimeOnTransport(int timeOnTransport) {
        this.timeOnTransport = timeOnTransport;
    }
}
