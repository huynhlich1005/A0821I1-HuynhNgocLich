package class_and_object_in_java.exercise.e2;

import java.util.Date;

public class Stopwatch {
    private Date startTime;
    private Date endTime;

    public Stopwatch() {
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }

    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}
