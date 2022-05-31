package LogicalProgram;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {

        System.out.println("Enter the key 's' to start the stopwatch : ");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        StopWatch stopWatch = new StopWatch();

        while(!(start.length() == 1 && start.equals("s"))) {
            System.out.println("Please enter the right key :");
            start = sc.nextLine();
        }

        System.out.println("Enter the key 'e' to end the stopwatch : ");
        Date startTime = stopWatch.noteTime();
        String end = sc.nextLine();

        while(!(end.length() == 1 && end.equals("e"))) {
            System.out.println("Please enter the right key : ");
            end = sc.nextLine();
        }
        Date endTime = stopWatch.noteTime();

        long timeDifference = endTime.getTime() - startTime.getTime();
        int differenceInSec = (int) (timeDifference / 1000);
        System.out.println("Stop Watch time = " +stopWatch.getStopWatch(differenceInSec));
    }

    String getStopWatch(int differneceInSec) {
        int hours = 0;
        int min = 0;
        int sec = 0;

        if(differneceInSec > 60) {
            min = differneceInSec / 60;
            sec = differneceInSec % 60;
        }
        else
            sec = differneceInSec;
        return hours + ":" + min +":" + sec;
    }
    Date noteTime() {
        Date startTime = new Date(System.currentTimeMillis());
        return startTime;
    }
}