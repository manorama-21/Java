package Task2;

import java.util.Vector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class vect {
    public static void main(String[] args) {
        
    //Add fruits
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Fruits : "+ fruits);

    //Iterate over the elements using an Iterator and print them.
        Iterator<String> iterator = fruits.iterator();
        System.out.println("After Iteration : " + iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    //Sort the Vector in alphabetical order.
        Collections.sort(fruits);
        System.out.println("Sorted List : " + fruits);

    //-----------------Enumeration(check all element and then print)------------------------//
         Enumeration<String> enumeration = fruits.elements();
         System.out.println("Elements using enumeration : ");
         while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
         }

    }

     }
