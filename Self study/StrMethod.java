public class StrMethod {
    public static void main(String[] args) {

        //--------------------------join()---------------------//
        String a = "Hello";
        String b = "India";
        String c = ",";
        String d = "welcome";
        
        String str = String.join(" ", a, b, c, d);
        System.out.println(str);
        //Output: Hello India , welcome

        
        //------------------------endsWith()----------------------//
        //     String a = "Hello Everyone";
        //     // checks if "Hello Everyone" ends with "one"
        //      System.out.println(a.endsWith("one"));
        // //Output: true
          
        //       // checks if "Hello Everyone" ends with "One"
        //       System.out.println(a.endsWith("One"));
        //  //Output: false
        
        
        //----------------------startsWith()---------------------//
        //     String a = "Hello Everyone";
        //     // checks if "Hello Everyone" starts with "he"
        //      System.out.println(a.startsWith("he"));
        // //Output: false 
          
        //       // checks if "Hello Everyone" starts with "He"
        //       System.out.println(a.startsWith("He"));
        //  //Output: true
        
        
        //-------------------------trim()-------------------------//
        //     String a = "   Hello World      ";
        //     System.out.println(a.trim());
        
        // //Output: Hello World
        
        
        //------------------------substring()----------------------//
        //     String str1 = "Hello World";
        //      // extract substring from index 0 to 3
        //     System.out.println(str1.substring(0,7));
        
        // //Output: Hello W
        
        
        //--------------------replace()----------------------------//
        //     String str1 = "Hello World";
        
        //     // replace i with s
        //     System.out.println(str1.replace('l', 's'));
        
        // //Output: Hesso Worsd
        
        
        //----------------------compareTo()--------------------------//
        //     String str1 = "Hello";
        //     String str2 = "Hello!";1
        //     int result;
        
        //     // comparing str1 with str2
        //     result = str1.compareTo(str2);
        //     System.out.println(result);
        
        // // Output: -1
        
        
        
        //--------------------------split()--------------------------//
        //     String a = "Hello World!";
        
        // // split string from space
        //     String[] result = a.split(" ");
        
        //     System.out.print("result = ");
        //     for (String str : result) {
        //       System.out.print(str + ", ");
        //     }
        // // Output: result = Hello, World!, 
        
        
        
        //----------------------lowercase() & uppercase()------------//
        // String str = "Hello World!";
        // String uppercase = str.toUpperCase();
        // System.out.println(uppercase);
        // // uppercase = "HELLO WORLD!"
        
        // String lowercase = str.toLowerCase();
        // System.out.println(lowercase);
        // //lowercase = "hello world!"
        
        //---------------------charAt()--------------------------//
        // String str = "This is a string";
        
        // System.out.println(str.charAt(0));
        
        // // Output: 'T'
        
        // System.out.println(str.charAt(15));
        // // Output: 'g'
        
        //------------------------equals()-----------------------//
        // String s1 = "Hello";
        // String s2 = "World";
        
        // System.out.println(s1.equals("Hello"));
        // // prints true
        
        // System.out.println(s2.equals("Hello"));
        // // prints false 
        
        // System.out.println(s2.equalsIgnoreCase("world"));
        // // prints true 
        
        
        //---------------------------concat()--------------------//
        // String s1 = "Hello";
        // String s2 = " World!";
        
        // String s3 = s1.concat(s2);
        // // concatenates strings s1 and s2
        
        // System.out.println(s3);
        // // prints "Hello World!"
                    
        //---------------------------indexOf()----------------------//
        // String str = "Hello World";
        
        // System.out.println(str.indexOf("l"));
        // // prints 2
        
        // System.out.println(str.indexOf("Wor"));
        // // prints 6
        
        // System.out.println(str.indexOf("z"));
        // // print -1
        
        
        
        //------------------------Length()-----------------------------//
        //    String str = "Hello World";
        //    System.out.println(str.length()); 
        
        //    //prints 11
    }
}


