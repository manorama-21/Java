
class Students{
String name; 
    int id;
    String email;
    // String name="Manu";
    // String roll="1";
    // // int[] marks={68,69,72,79,85};
    // String email="manu@gmail.com";

    public void display(){
        System.out.println(name+" "+id+" "+email);

    }
}


public class Classes {
public static void main(String[] args) {
 //---------single entry--------//
   Students a1 = new Students();

   a1.name="Manu";
   a1.id=01;
   a1.email="manu@abc.com";


  a1.display();


  //--------multiple entry--------//

  Students a2 = new Students();
  Students a3 = new Students();
  Students a4 = new Students();
  Students a5 = new Students();


  a2.name="Peehu";
  a2.id=02;
  a2.email="p@abc.com";

  a3.name="Trapti";
  a3.id=03;
  a3.email="t@abc.com";

  a4.name="Sak";
  a4.id=04;
  a4.email="s@abc.com";

  a5.name="Annu";
  a5.id=05;
  a5.email="a@abc.com";

  a2.name="abc";

  a2.display();
  a3.display();
  a4.display();
  a5.display();


    // System.out.println("Hello");
    // int a, b, c;
}

}



