package SQA;

import java.util.Scanner;

public class RemovePunc {
    public static void main (String[] args){
        /* 1. Remove Punctuation [! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ ] ^ _ ` { | } ~ ]
        From String */


        Scanner val =new Scanner(System.in);
        String input=val.nextLine();
        remove_Punctuation(input);

    }
    public static void remove_Punctuation(String val){
        String newValue;
        for (int i=0; i<val.length(); i++){
            newValue= String.valueOf((val.charAt(i)));
            if (newValue.contains("[")||	newValue.contains("!")||	newValue.contains("\\")||	newValue.contains("#")||	newValue.contains("$")||	newValue.contains("%")||	newValue.contains("&")||	newValue.contains("'")||	newValue.contains("(")||	newValue.contains(")")||	newValue.contains("*")||	newValue.contains("+")||	newValue.contains(",")||	newValue.contains("-")||	newValue.contains(".")||	newValue.contains("/")||	newValue.contains(":")||	newValue.contains(";")||	newValue.contains("<")||	newValue.contains("=")||	newValue.contains(">")||	newValue.contains("?")||	newValue.contains("@")||	newValue.contains("/[")||	newValue.contains("/]")||	newValue.contains("^")||	newValue.contains("_")||	newValue.contains("`")||	newValue.contains("{")||	newValue.contains("|")||	newValue.contains("}")||	newValue.contains("~")||	newValue.contains("]")) {
                newValue.replaceAll("[!\\#$%&'()*+,-./:;<=>?@^_`{|}~]","");
            }
            else{
                System.out.print(newValue);
            }
        }
    }

}
