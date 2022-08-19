import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner userinput = new Scanner (System.in);
        int num = userinput.nextInt();
        if (num>0){
            System.out.println("User input: '"+num+"' is Positive");
        }
        else if (num<0) {
            System.out.println("User input: '"+num+"' is Negative");

        }
        else {
            System.out.println("User input: '"+num+"' is 0");

        }


    }
}