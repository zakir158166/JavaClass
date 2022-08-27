import java.util.*;


public class New {

    public static void main (String[] args){
        int[] number ={8,5,9};

        int result= smallestNumber(number);
        System.out.println(result);

    }

    public static int smallestNumber(int... small){
        Arrays.sort(small);
        return small[0];
    }
}