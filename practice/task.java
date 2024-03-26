package practice;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

enum State{
    TODO, BEGN, HALT, WAIT, DONE;
}

class task{
    private final String title;
    private String description;
    private LocalDate scheduled;
    private LocalDate deadline;
    private State state;

    public task(String title, State state){
        this.title = title;
        this.state = state;
    }

    public String getTtitle(){
        return title;
    }

    public State getState(){
        return state;
    }

    public LocalDate getScheduled(){
        return this.scheduled;
    }

    public LocalDate getDeadline(){
        return this.deadline;
    }

    public String getDescription(){
        return this.description;
    }


    public void setTtitle(String title){
        return;
    }

}