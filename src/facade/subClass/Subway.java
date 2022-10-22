package facade.subClass;

public class Subway implements Transport{

    private String name = "subway";
    private int timeOnTransport;

    public Subway(int timeOnTransport) {
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
