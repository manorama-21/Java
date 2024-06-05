public class variables {
    
//--------------------local variable------------//
    // public static void main(String[] args) {
        // int a = 10;  
        // System.out.println(a);
    
         //output: 10


//-------------------static variable-------------//

    // static int a = 20;
    // public static void main(String[] args) {
    //        System.out.println(variables.a);

        //output: 20
        
    
//------------------instance variable---------------//

        int a = 30;
    public static void main(String[] args) {
        variables ref = new variables();
        System.out.println(ref.a);

        //output: 30
}
}
