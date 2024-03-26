package week5;

public class Generics {


    public static void main(String[] args){

        Integer[] intarray = {1, 2, 3, 4};
        Double[] doublearray = {1.1, 2.2, 3.3, 4.4};
        Character[] chararray = {'H', 'J', 'O', 'U'};
        String[] stringarray = {"B", "Y", "E", "A"};

        //displayarray(intarray);
        //displayarray(doublearray);
        //displayarray(chararray);
        //displayarray(stringarray);

        System.out.println(getfirst(intarray));
        System.out.println(getfirst(doublearray));
        System.out.println(getfirst(chararray));
        System.out.println(getfirst(stringarray));
    }

    public static <T> void displayarray(T[] array){

        for (T x: array){
            System.out.println(x + "");
        }
    }

    public static <thing> thing getfirst(thing[] array){
            return array[1];
    }
    
}
