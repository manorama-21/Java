//--------classes and objects-------//

// class adit{
//     String name = "Manu";
//     int age = 30;

//     void display(){
//         System.out.println(name + " " + age);
//     }
// }

// public class abc2 {
//     public static void main(String[] args) {
//         adit student = new adit();
//         // student.display();

//         System.out.println(student.name);
//     }
// }

class adit{
    String name ;
    int age ;

    void display(){
        System.out.println(name + " " + age);
    }
}

public class abc2 {
    public static void main(String[] args) {
        adit student = new adit();
        student.name = "manu";
        student.age = 30;
        student.display();

        // System.out.println(student.name);
    }
}
