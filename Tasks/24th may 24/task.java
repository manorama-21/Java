
public class task {
    public static void main(String[] args) {

                // WAP to Swap Two Numbers in java. 
                                                               
    System.out.println("Task 1");
        int a = 5;
        int b = 6;
        int c;
        System.out.println("before swapping a: "+a);
        System.out.println("before swapping b: "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a: "+a);
        System.out.println("After swapping b: "+b);


                // WAP to convert Integer numbers and Binary numbers in java. 

    System.out.println("Task 2");

        int d = 25;
        System.out.println("Integer Number:"+d);
      System.out.println("Convert Binary Number:"+Integer.toBinaryString(d));


                //WAP to Find Factorial of a Number in Java. 

    System.out.println("Task 3");
        
        int e =10;
        int num = 1;

        for(int x = 1; x <= e; ++x){
            num *= x;
        }
        System.out.printf("Factorial of %d = %d", e ,num);

                //WAP to Add two Complex Numbers in Java. 

    // System.out.println("Task 4");

       
                // WAP to Calculate Simple Interest in Java. 

    System.out.println();
    System.out.println("Task 5");

        int p, r, t, SI;
        p =10000;
        r = 12;
        t = 4;
        SI = (p*r*t)/100;
        System.out.println("Simple Interest is: "+SI);
    }
    
}