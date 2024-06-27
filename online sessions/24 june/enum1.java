// // class manu{
// //     int age = 21;
// //     int rool= 20;
// //     String name= "kuku";
// //     public void display(){
// //         System.out.println(name = " + age");
// //     }
// // }


// enum alld {
//     manu, pushpa, trapti, annu;
//     private alld(){

//     }
// }

// public void stud(){
//     System.out.println("Student called");
// }

// public class enum1 {
//     public static void main(String[] args) {
//         manu obj = new manu();
//         obj.stud();

//         // alld obj = alld.annu;
//         // alld[] obj = alld.values();
//         // System.out.println(obj);
//     }
// }






// class trapti{
//     int age = 21;
//     String name = "trapti";
//     public void display(){
//         System.out.println(name + " " +age);
//     }


enum patna{
    trapti, manu, pratibha, peehu
}

enum ddn implements patna{
    trapti;
}

// private void  patna(){
//     System.out.println("constructor called");
// }
public class enum1 {
    public static void main(String[] args) {
        // trapti obj = new trapti();
        // obj.display();

        // patna obj = patna.trapti;
        // System.out.println(patna.trapti.toString());

        patna[] obj = patna.values();
        // System.out.println(obj[2]);


        for (int i = 0; i<=obj.length; i++){
            System.out.println(obj[i]);
        }


    }
    
}
