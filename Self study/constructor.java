
// // Create a Main class
// public class Main {
//    //------------------ Create a class attribute-----------------//
//     int x; 
  
//     // --------------Create a class constructor for the Main class---------//
//     public Main() {

//    //--------- Set the initial value for the class attribute x----------//
//       x = 5;  
//     }
  
//     public static void main(String[] args) {
//       Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
//       System.out.println(myObj.x); // Print the value of x
//     }
//   }




  public class constructor {
    int modelYear;
    String modelName;
  
    public constructor(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      constructor myCar = new constructor(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  
