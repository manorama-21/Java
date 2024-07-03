import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class col {
    public static void main(String[] args) {

        ArrayList all = new ArrayList();

        
        all.add(101);
        all.add(102);
        all.add(103);
        all.add(104);
        all.add(105);

        System.out.println("All :  " + all);

        for(int i = 0; i <= all.size()-1; i++){
            System.out.println("Index number :  " + i + " "+ "Value is :  " + all.get(i));
        }


        System.out.println("---------------------------------");

        Iterator iterator = all.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }


        System.out.println("---------------------------------");

        ListIterator listIterator = all.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }


        System.out.println("-------------------In Reverse Order--------------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
        }


// Creating Clone of ArrayList

       ArrayList ArrayListClone = (ArrayList) all.clone();
        System.out.println("Original ArrayList : " + all);
        System.out.println("Clone ArrayList : " + ArrayListClone);


    }
}
