
class Main {
public static void main(String[] args) {

                //Arithmetic operators
     System.out.println("Arithmetric operators");
    //declare variable
    int a = 6;
    int b = 4;

    //Addition
    System.out.println("Addition: a + b = "+(a+b));
    
    //Substraction
    System.out.println("Substraction: a - b = "+(a-b));

    // Multiple
    System.out.println("Multiplication: a * b = "+(a*b));

    // Division
    System.out.println("Division: a / b = "+(a/b));

    // Modulus
    System.out.println("Modulus: a % b = "+(a%b));

                  //Assignment Operators
     System.out.println("Assignment operators");
     // create variables
     int c = 4;
     int var;
 
     // assign value using =
     var = c;
     System.out.println("var using =: " + var);
 
     // assign value using +=
     var += c;
     System.out.println("var using +=: " + var);

     // assign value using -=
     var -= c;
     System.out.println("var using -=: " + var);
 
     // assign value using =*
     var *= c;
     System.out.println("var using *=: " + var);

     // assign value using /=
     var /= c;
     System.out.println("var using /=: " + var);

      // assign value using %=
     var %= c;
     System.out.println("var using %=: " + var);

      // assign value using %=
      var &= c;
      System.out.println("var using &=: " + var);

       // assign value using %=
     var |= c;
     System.out.println("var using |=: " + var);

      // assign value using %=
      var ^= c;
      System.out.println("var using ^=: " + var);

       // assign value using %=
     var >>= c;
     System.out.println("var using >>=: " + var);

      // assign value using %=
      var <<= c;
      System.out.println("var using <<=: " + var);


                // Relational/Comparision Operators

     System.out.println("Relational operators");
     // create variables
     int d = 7, e = 11;
 
     // == operator
     System.out.println(d == e);
 
     // != operator
     System.out.println(d != e);  
 
     // > operator
     System.out.println(d > e);  
 
     // < operator
     System.out.println(d < e);  
 
     // >= operator
     System.out.println(d >= e);  
 
     // <= operator
     System.out.println(d <= e);  


                    //Logical Operators

     System.out.println("Logical operators");
    // && operator
    System.out.println((5 > 3) && (8 > 5));  
    System.out.println((5 > 3) && (8 < 5));  

    // || operator
    System.out.println((5 < 3) || (8 > 5));  
    System.out.println((5 > 3) || (8 < 5)); 
    System.out.println((5 < 3) || (8 < 5)); 

    // ! operator
    System.out.println(!(5 == 3));  
    System.out.println(!(5 > 3));  


               //Birwise operator

     System.out.println("Bitwise operators");
     // create variable
     int f = 12; 
     int g = 10; 
     
     System.out.println("f & g = " + (f & g)); // Bitwise AND: 00001000 (8 in decimal)
     System.out.println("f | g = " + (f | g)); // Bitwise OR: 00001110 (14 in decimal)
     System.out.println("f ^ g = " + (f ^ g)); // Bitwise XOR: 00000110 (6 in decimal)
     System.out.println("~f = " + (~f)); // Bitwise NOT: 11110011 (-13 in decimal)
     System.out.println("f << 2 = " + (f << 2)); // Bitwise left shift: 00110000 (48 in decimal)
     System.out.println("f >> 2 = " + (f >> 2)); // Bitwise right shift: 00000011 (3 in decimal)

}}