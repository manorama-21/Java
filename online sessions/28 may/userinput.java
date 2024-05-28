import java.math.BigInteger;
import java.util.Scanner;

public class userinput{
    public static void main(String[] args) {
        // java.util.Scanner a = new java.util.Scanner(System.in);
                       
                // System.out.println("Enter your name7: ");
               // String name=a.nextLine();
               // // System.out.println("your name is: "+ name);
        
               // System.out.println("Enter your password: ");
               // String pwd= a.nextLine();
               // System.out.println("Your password is:"+pwd);
        
        
        
        //.....for loop....//
    
        
Scanner a = new Scanner(System.in);
System.out.println("Enter number");

int num = a.nextInt();

System.out.println("Table of: "+num);

for(int i = 1; i<= 10; i++){
    System.out.println(num*i);
}
        
        //.......Bigtnteger....//

        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter your phone: ");
        // BigInteger phone = a.nextBigInteger();
        // System.out.println("your phone no is: "+phone);
        
        
        
        
        //.......long dtype....//
        
        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter your phone: ");
        // long age = a.nextLong();
        // System.out.println("your phone no is: "+age);
        
        
        //......float dtype....//
        
        //   Scanner a = new Scanner(System.in);
        // System.out.println("Enter your height: ");
        // float age = a.nextFloat();
        // System.out.println("your height is: "+age);
        
        
        
         //.....double dtype...//

        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter your height: ");
        // double age = a.nextDouble();
        // System.out.println("your height is: "+age);
        
        
        //........byte dtype.......//
        
        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // byte age = a.nextByte();
        // System.out.println("your age is: "+age);
        
        
        
        //......boolean dtype....//
        //  Scanner a = new Scanner(System.in);
        // System.out.println("Do you have a laptop");
        // boolean laptop = a.nextBoolean();
        
        // if(laptop){
            //     System.out.println("you have a laptop");
            // }else{
                //     System.out.println("Donot have laptop");
                // }



                


                    //......|| operator.......//
        // if(name.equals("Manu") || name.equals("")){
        //     if(pwd.equals("123")){
        //         System.out.println("Authorised User");
        //     }
        // }else{
        //     System.out.println("Unautorised");
        // }


                     //.......&& operator......//        
        // if(name.equals("Manu") && pwd.equals("12345")){
        //     System.out.println("Authorised User");
            
        // }else{
        //     System.out.println("Unautorised");
        // }


        // if(name == ""){
        //     System.out.println("User Access");
        // }else{
        //     System.out.println("Logging out....");
        // }


        // int age = a.nextInt();

        // if(age >= 18){
        //     System.out.println("you are eligible");
        // }else{
        //     System.out.println("Not eligible");
        // }
    }
}