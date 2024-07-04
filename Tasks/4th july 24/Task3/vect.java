package Task3;

import java.util.List;
import java.util.Vector;

public class vect {
    public static void main(String[] args) {

    //Add elements 1 through 10 to the Vector.
        Vector<Integer> vector =new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        System.out.println("Original eLement : ");
        for (Integer num : vector){
            System.out.println(num);  
        }

    //Create a sublist view of elements from index 3 to 7.
        List<Integer> sublist = vector.subList(3, 7);
        System.out.println("SubList : "+ sublist);

    //Modify an element in the sublist.
        sublist.set(2, 20);
        System.out.println("Modify List : " + sublist);

    //Print both the sublist and the original Vector to show the changes.
        System.out.println("Original vector : "+ vector);
        System.out.println("SubList : " + sublist);


    }
}
