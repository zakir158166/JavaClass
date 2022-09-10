package SQA;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
//        2. Print after removing duplicates from a given string
//        3. Return True if all values are equal to a list
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(duplicateString(str));;
    }
    public static String duplicateString(String str){
        String Value="";
        for (int i=0;i<str.length();i++){
            if (!Value.contains(String.valueOf(str.charAt(i)))){
                Value += String.valueOf(str.charAt(i));
            }
        }
        return Value;
    }
}