
// ------------Abstract Class-----------------//

abstract class adit {

    // String name = "manu";  //protected
    // private int age = 30;
    // public int salary = 10000;


    public abstract void prayagraj();  

    public void patna(){
        System.out.println("Nashit");
    }

    public void dehradun(){
        System.out.println("Mohit");
    }

    public void ban(){
        System.out.println("Ankur");
    }

}

//---------------Concrete Class---------------//

class nsti extends adit{
    public void prayagraj(){

    }
}
public class Interface {
    public static void main(String[] args){
        adit a = new nsti();
        //  System.out.println(a.name);
        // a.prayagraj();
        // a.patna();


    }
}
