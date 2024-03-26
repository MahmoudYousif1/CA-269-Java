package practice;
import java.util.*;

public abstract class vehicle{

    abstract void go();


    public static void main(String[] args){

        car car = new car();
        bike bike = new bike();
        boat boat = new boat();

        vehicle[] racers = {car, bike, boat};

        for (vehicle x : racers){
            System.out.println(x);
        }
    }
}

class car extends vehicle{

    @Override
    public void go(){
        System.out.println("The car is going");
    }
}

class bike extends vehicle{

    @Override
    public void go(){
        System.out.println("The bike is going");
    }

}

class boat extends vehicle{

    @Override
    public void go(){
        System.out.println("The boat is going");
    }

}
