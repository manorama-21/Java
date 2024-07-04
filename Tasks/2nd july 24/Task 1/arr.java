import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arr {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();

        
        ls.add (101);
        ls.add (102);
        ls.add (103);
        ls.add (104);
        
        System.out.println("Main list : " + ls);


System.out.println("------------------Size()------------------------------");

        //size method
        int size = ls.size();
 
        // Printing the size of List
        System.out.println("Size of list : " + size);

System.out.println("----------------Add (int, E)--------------------------");

         // Add a new element at index 1
         ls.add(0, 201);
       
         // prints all the elements available in list
         
             System.out.println("Add new element in indexing 0 :"+ls + " ");
    
      
System.out.println("------------------Remove()----------------------------");

         ls.remove(3);
         System.out.println("After removing final list : " + ls);

    }
}
