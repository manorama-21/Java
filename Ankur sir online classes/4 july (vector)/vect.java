import java.util.Collections;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;
import java.util.ListIterator;


public class vect {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<>();
        vector.add("Piyush");
        vector.add("Peehu");
        vector.add("Anjali");

//----------------Update through indexing-----------------//
        vector.add(0, "Trapti");
         System.out.println(vector);


         String firstElement =vector.firstElement();
         String lastElement =vector.lastElement();
         String elementataindex =vector.get(2);

         System.out.println("First Element : " + firstElement);
         System.out.println("Last Element : " + lastElement);
         System.out.println("Index Wala Element : " + elementataindex);

//------------------Removing Elements---------------------//
         vector.remove("Anjali");
         System.out.println("Remove element with name : "+vector);

         vector.remove(1);
         System.out.println("Remove element with indexing : " + vector);

//------------------Add new element----------------------//
         vector.add("Vaishu");
         vector.add("Manu");


//-----------------Enumeration(check all element and then print)------------------------//
         Enumeration<String> enumeration = vector.elements();
         System.out.println("Elements using enumeration : ");
         while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
         }


//----------------------Iterator----------------------//

         Iterator<String> iterator = vector.iterator();
         System.out.println("After Iteration : ");
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         }

//----------------List Iterator---------------------//
         ListIterator<String> listIterator = vector.listIterator();
         System.out.println("After List Iterator : " + listIterator);
         while (listIterator.hasNext()){
            System.out.println(listIterator.next());
         }

//------------------Boolean type-----------------------//
         boolean elementhai =vector.contains("Vaishu");
         System.out.println("Is Vaishu in list ? : "+ elementhai);

         boolean elementhai1 =vector.contains("Piyush");
         System.out.println("Is Piyush in List ? : " + elementhai1);


//------------------Size of List--------------------------//
         int size = vector.size();
         System.out.println(size);


//-------------------Sorted List----------------------------//
         Collections.sort(vector);
         System.out.println(vector);

//------------------Copy All Element------------------------//
         Vector<String> vectorcopy = new Vector<>();
         System.out.println("Copy Elements : "+ vectorcopy);

//-----------------Clear All element--------------------------//
         vector.clear();
         System.out.println("After clear All element : "+ vector);


    }
}
