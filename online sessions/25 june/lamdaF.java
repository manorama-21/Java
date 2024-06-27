interface C{
    void display();
}


public class lamdaF {
    public static void main(String[] args) {
//------------abstract function-----------//

        // A obj = new A(){
        //     public void display(){
        //         System.out.println("Hello");
        //     }
        // };
       
       //----------------Lamda Function-----------------//

    // lamda function works only with functional interface
    //agar multiple function show kern ahai to interfce ko functional interface bna lege
       
        C obj = () -> System.out.println("lamda function");
        obj.display();

    }
}
