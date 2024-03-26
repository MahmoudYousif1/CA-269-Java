
import java.util.*;

//Class of Value that implements the Comparable interface
class Value implements Comparable<Value> {
    final int value_number;
    private static boolean SORT_LOWER = true;

    // Constructor
    Value(int value_number) {
        this.value_number = value_number;
    }

    public static void setSortLower(){

        SORT_LOWER = true;
    }

    public static void setSortHigher(){

        SORT_LOWER = false;
    }

    public static boolean isSortLower(){
        return SORT_LOWER;
    }

    public static boolean isSortHigher(){
        return !SORT_LOWER;
    }

    // Getter
    public int getValueNumber(){
        return value_number;
    }


    //String method to return the output
    public String toString(){
        String output = "" + value_number;
        return output;
    }


    @Override
    public int compareTo(Value other) {
        if (this.value_number == other.value_number) {
            return 0;
        } else if (isSortLower()) {
            return this.value_number < other.value_number ? -1 : 1;
        } else {
            return this.value_number > other.value_number ? -1 : 1;
        }
    }

}

class PreferLowerValues implements Comparator<Value> {
    @Override
    public int compare(Value v1, Value v2) {
        return Integer.compare(v1.value_number, v2.value_number);
    }
}

class PreferHigherValues implements Comparator<Value> {
    @Override
    public int compare(Value v1, Value v2) {
        return Integer.compare(v2.value_number, v1.value_number);
    }
}


public class MyFancyDataStructure {
    public static void main(String[] args) {
        List<Value> list = Arrays.asList(new Value(2), new Value(3), new Value(1));

        // Test SORT_LOWER=true
        Value.setSortLower();
        Collections.sort(list);
        System.out.println(list);

        // Test SORT_LOWER=false
        Value.setSortHigher();
        Collections.sort(list);
        System.out.println(list);

        // Test PreferLowerValues
        list.sort(new PreferLowerValues());
        System.out.println(list);

        // Test PreferHigherValues
        list.sort(new PreferHigherValues());
        System.out.println(list);
    }
}
