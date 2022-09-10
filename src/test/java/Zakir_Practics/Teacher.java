package Zakir_Practics;

public class Teacher {
    public static void main (String[] args){
        New t1=new New();
        t1.name="Zakir Hossain";
        t1.gender="mail";
        t1.phone=12357890;
        System.out.println("Name is "+t1.name);
        System.out.println("Gender is "+t1.gender);
        System.out.println("Phone number is "+t1.phone);

        New t2=new New();
        t2.name="Aklima Hossain";
        t2.gender="female";
        t2.phone=12357893;
        System.out.println("Name is "+t2.name);
        System.out.println("Gender is "+t2.gender);
        System.out.println("Phone number is "+t2.phone);


        String[] name={"zakir","Fahad"};
        String[] gender={"male","male"};
         people(name,gender);
    }

    public static void people(String[] name,String[]gender){
        for (String n:name){
            System.out.println(n);
            System.out.println(gender);
        }
        for (String g:gender){
            System.out.println(g);
        }
    }

}
