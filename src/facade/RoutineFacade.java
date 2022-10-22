package facade;

import facade.subClass.*;

public class RoutineFacade {

    public void printRoutine(DayOfTheWeek day){
        Go go = new Go();
        Stay stay = new Stay();

        go.depart();
        go.takeTransport(new Bus(20));
        go.takeTransport(new Subway(30));
        go.arrive();

        stay.work();

        switch (day){
            case FRI -> {
                stay.meeting();
            }
        }
    }

}
