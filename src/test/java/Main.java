import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Please input require number:");
        int num = userInput.nextInt();
        if (num>0){
            System.out.println("User input: '"+num+"' is Positive Value");
        }
        else if (num<0) {
            System.out.println("User input: '"+num+"' is Negative Value");

        }
        else {
            System.out.println("User input: '"+num+"' is Zero");

        }

        int num1=10;
        if (num1>0){
            System.out.println("Number("+num1+") contain Positive Value");
        }else if (num1<0){
            System.out.println("Number("+num1+") contain Negative Value");
        }else {
            System.out.println("Number("+num1+") contain equal Value");
        }

        class SwitchClass {
        public static int positive (int inp){
            if (inp>0)
            return 1;
            else if (inp<0)
            return -1;
            else
            return 1;

//            switch (positive(inp)){
//                case 1:
//                    System.out.println("positive");
//            }
        }
        }
    }


}
