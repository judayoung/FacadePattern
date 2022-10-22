package facade.subClass;

public interface Transport {

    String name = "transport";
    int timeOnTransport = 0;

    String getName();

    void setName(String name);

    int getTimeOnTransport();

    void setTimeOnTransport(int timeOnTransport);

}
