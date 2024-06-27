// class A{
//     //---------------Variables--------------------//
//     int age =34;
//     String name="Manu";
//     String location="Prayagraj";

//     //---------------Methods----------------------//
//     public void display(){
//         System.out.println(name + " "+ age + " " + location);

//     }
//     public int add(int a, int b){
//         return a+b;
//     } 
// }


//------------------interfaces---------------------//
//--------abstract is basically ideas---------//
// abstract class A{
//     abstract void display();
// }



//-----------concrete-------------//
// class B extends A{
//     public void display(){
//         System.out.println("Hello");
//     }
// }


interface A{
    void display();
}

// class B implements A{
//     public void display(){
//         System.out.println("Hello");
//     }
// }




public class alld {
   public static void main(String[] args) {
        // B obj = new B();
        // obj.display();

        A obj = new A(){
            public void display(){
                System.out.println("Hello");
            }
        };



   }
}
