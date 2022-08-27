package SQA;

import java.util.Arrays;

public class SmallestValue {

        public static void main (String[] args){
            int[] number = {8,5,9};
            int[] number1 = {10,8,3};

                for (int num:number){
                    System.out.print(num+",");
                }

                int result= smallestNumber(number);
                System.out.println("Smallest value is: "+result);

                for (int num:number1){
                    System.out.print(num+",");
                }
                int result1= smallestNumber(number1);
                System.out.println("Smallest value is: "+result1);

        }

        public static int smallestNumber(int... small){
            Arrays.sort(small);
            return small[0];
        }
    }
