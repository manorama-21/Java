public class eHand {
    public static void main(String[] args) {
        //----------ArithmeticException-------//

        int a = 57;
        int b = 0;
        int d[] ={2,3,5};
        String c = null;

try{
    System.out.println(c.length());
    System.out.println(d[5]);
    System.out.println("block1");
    System.out.println("block2");
    // int c = a/b;
    System.out.println("block");
}

catch(ArithmeticException i){
    System.out.println("division by 0 error");
}
catch(ArrayIndexOutOfBoundsException j){
    System.out.println("Array error");
}
catch(Exception k){
    System.out.println("new error");
}
// catch(Exception x){
//     System.out.println("devision by 0 error");
// }
//   System.out.println("hello");
//         System.out.println("this part fine");


                
        // int c =a/b;
        // // System.out.println(c);
      



    //     int d = a+b;
    //     System.out.println(d + "hello");


    
    //     try{
    //     int c = a/b;
    //     System.out.println(c);
    // }catch(Exception x){
    //     System.out.println("error");
    // }
    // System.out.println("hello");
    

    }
}
