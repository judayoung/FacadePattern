import facade.DayOfTheWeek;
import facade.RoutineFacade;

public class FacadeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's see our daily routine!\n");

        RoutineFacade routineFacade = new RoutineFacade();

        System.out.println("...FRIDAY routine");
        routineFacade.printRoutine(DayOfTheWeek.FRI);
        System.out.println();

        System.out.println("...MONDAY routine");
        routineFacade.printRoutine(DayOfTheWeek.MON);
        System.out.println();
    }

}
