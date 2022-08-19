import java.util.Scanner;
class CheckPositiveNegativeSwitch1{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in); //create a scanner object for input
        System.out.print("\nEnter the integer number: ");

        int num=scan.nextInt();//get input from the user for num
        int result=positive(num);

        switch(result){
            case 0://check  num is negative
                System.out.print(num+" is negative");
                break;
            case 1://check  num is positive
                System.out.print(num+" is positive");
                break;
            default:
                System.out.print("the given number is zero");
                break;
        }
    }
    public static int positive(int num){
        if(num>0){
            return 1;
        }
        else if(num<0){
            return 0;
        }
        else{
            return -1;
        }
    }
}