package practice;
import java.util.*;

public abstract class animals{


    public static void main(String[] args){

        rabbit rabbit = new rabbit();
        hawk hawk = new hawk();
        fish fish = new fish();

        animals[] thisanimals = {rabbit, hawk, fish};

        for(animals x : thisanimals){
            System.out.println(x);
        }

    }
}

class rabbit extends animals implements Prey{

    @Override
    public void flee(){
        System.out.println("The rabbit is fleeing");
    }

}

class hawk extends animals implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk is hunting the prey");
    }
}

class fish extends animals implements Predator, Prey{

    @Override
    public void flee(){
        System.out.println("The fish is fleeing from bigger fish");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting smaller fish");
    }

}