import java.util.Collections;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        
        stack.add("Anjali");
        stack.add("Peehu");
        stack.add("Manu");
        stack.add("Trapti");
        
        System.out.println("Original Stack : " + stack);

System.out.println("---------------------------------------");

        stack.insertElementAt("Vaishu", 1);
        stack.insertElementAt("Annu", 3);
        System.out.println("Insert new value through indexing : " + stack);

System.out.println("---------------------------------------");

        stack.push("Jyoti");
        System.out.println("Add new value  in last: " + stack);

System.out.println("---------------------------------------");
        
         System.out.println("The element of top in stack : " +stack.peek());

System.out.println("---------------------------------------");

        Collections.sort(stack);
        System.out.println("sorted list : "+ stack);

System.out.println("---------------------------------------");

        int size =stack.size();
        System.out.println("Size of list : " + size);

System.out.println("---------------------------------------");  

        int capacity =stack.capacity();
        System.out.println("Capacity of list : " + capacity);

System.out.println("---------------------------------------");

        Object copy = stack.clone();
        System.out.println("Clone of the list : " + copy);

System.out.println("---------------------------------------");

        boolean empty = stack.isEmpty();
        System.out.println("Is list empty ? : " + empty);  

System.out.println("---------------------------------------");

        stack.set(2, "Sakshi");
        System.out.println("Modify new element in indexing 2 : " + stack);

System.out.println("---------------------------------------");

        stack.remove(1);
        System.out.println("Remove through indexing 1 : "+ stack);

System.out.println("---------------------------------------");

        stack.removeLast();
        System.out.println("Remove last element : "+ stack);

System.out.println("---------------------------------------");

        stack.removeFirst();
        System.out.println("Remove last element : "+ stack);

System.out.println("---------------------------------------");

        stack.clear();
        System.out.println("Clear All element in list : "+ stack);
        
System.out.println("---------------------------------------");




    }

}
