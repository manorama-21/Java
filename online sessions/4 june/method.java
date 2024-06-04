
class Alld{
    int a;
    int b;
//--------------------constructor--------------------// 
    // public Alld(int a, int b) {
    //     this.a = a;
    //     this.b = b;

   // }

   public void add(){
    int c = a+b;
    System.out.println("a+b = " + c);
   }
    
}

public class method {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class p1 = Class.forName("Alld");
        // System.out.println(p1);


        Alld p1 = new Alld();
        p1.a = 10;
        p1.b =20;
        p1.add();

        Alld p2 = new Alld();
        p2.a = 20;
        p2.b = 30;
        p2.add();

    }
}
