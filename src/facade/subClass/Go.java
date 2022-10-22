package facade.subClass;

public class Go {

    public void depart(){
        System.out.println("depart...");
    }

    public void takeTransport(Transport transport){
        System.out.println("take the "+transport.getName()+" for "+transport.getTimeOnTransport()+" minutes...");
    }

    public void arrive(){
        System.out.println("arrive...");
    }
}
