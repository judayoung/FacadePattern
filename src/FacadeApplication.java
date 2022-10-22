import facade.DayOfTheWeek;
import facade.RoutineFacade;

public class FacadeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's see our daily routine!\n");

        RoutineFacade routineFacade = new RoutineFacade();
        routineFacade.printRoutine(DayOfTheWeek.FRI);
    }

}
