import java.util.Vector;

public class vect {
    public static void main(String[] args) {
       
    //Add vector elements
        Vector<Integer> vector =new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Original Elements : "+vector);

    //Insert 25 at index 2
        vector.add(2,25);
        System.out.println("Inserted Elements : " + vector);

    //Remove Element at index 3
        vector.remove(3);
        System.out.println("Remove element through indexing : " + vector);

    //Retrieve the element at index 1.
        int get = vector.get(1);
        System.out.println("Get Element through indexing : " + get);

    //Print the size
        int size =vector.size();
        System.out.println("Size of element : " + size);

    //Capacity of Element
        int capacity =vector.capacity();
        System.out.println("Capacity of element : " + capacity);
    }
}
