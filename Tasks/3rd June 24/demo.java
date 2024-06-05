import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class demo{
    public static void main(String[] args) {
        
// Write a java program to Append text or string in a file 

 
    //    File path = new File("test.txt");
    //     String text = "I am from Nsti Allahabad";
   

    //     try{
    //             FileWriter a =new FileWriter(path, true);
    //                 a.write(text);
                
    //                 a.close();

    //             System.out.println("Appended successfully");
    //         }catch(Exception e){
    //             System.out.println("file can not be written");
    //        }




// Write a java program to Read content from file using BufferedReader 


        // File path = new File("test.txt");

        // try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        //     String line;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace(); 
        // }



//Write a java program to Get the size of give file in bytes, kilobytes and megabytes 


            // File path = new File("test.txt");
            // if(path.exists()) {
            //     long bytes = path.length();
            //     double kilobytes = bytes / 1024.0;
            //     double megabytes = kilobytes / 1024.0;

            //     System.out.println("File size is bytes: "+ bytes);
            //     System.out.println("File size is kilobytes: "+kilobytes);
            //     System.out.println("File size is megabytes: "+ megabytes);

            // }else{
            //     System.out.println("File not found");
            // }



//Write a java program to Delete a file 

            // File path = new File("abc.txt");
            // if(path.exists()) {  
            //     path.delete();
            //         System.out.println("File deleted successfully");
                
            //  }else{
            //     System.out.println("file not found");
            //  }



//Write a java program to Read a file line by line (scanner)


        //     try{
        //     File path = new File("test.txt");
        //     Scanner file = new Scanner(path);
           
        //     while(file.hasNextLine()){
        //     String data = file.nextLine();
        //     System.out.println(data);
        //     }
        // }catch(Exception e){
        //     System.out.println("not found");
        // }



//Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException.

        //     int[] a= {3,5,7,9};
        //     Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an index to access (0 to " + (a.length - 1) + "): ");
        // int b = sc.nextInt();
    
        // try {
        //     int value = a[b];
        //     System.out.println("Value at index " + b + ": " + value);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Error: Please enter a valid index.");
        // } 


//Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException. 


     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } 
            
        



//Create a custom exception InvalidAgeException that includes the invalid age value as additional data. Write a program that takes age as input and throws this exception if the age is not within the valid range (0-120).
    


}

}