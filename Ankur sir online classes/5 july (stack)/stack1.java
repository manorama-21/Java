import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(101);
        stack.push("Annu");

        
        System.out.println("After two element push : "+stack);

        stack.push("peehu");
        stack.push(102);

        System.out.println(stack);

//------------------------remove last element--------------//
        stack.pop();
        System.out.println(stack);

        // stack.pop();
        // System.out.println(stack);

//----------------Iterator----------------------------//
        Iterator iterator = stack.iterator();
        System.out.println("After Iteration : ");
        while ( iterator.hasNext()) {
            System.out.println(iterator.next() + "");
            
        }


//----------------List Iterator------------------------//
        ListIterator listIterator = stack.listIterator();
        System.out.println("After List Iteration : ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "");
        }


//-------------------------Reverse Order------------------//
        System.out.println("Reverse Order : ");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}
