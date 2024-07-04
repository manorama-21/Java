import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Iterator;


class Person {
    private String name;
    private int age;

    // Constructor to initialize the properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the toString method to return a string representation
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public int getAge(){
      return age;
    }
}

public class main {
    public static void main(String[] args) {
  
System.out.println("----------------------------------------------------------");

      // Create LinkedList instances
        LinkedList<Person> list1 = new LinkedList<>();
        LinkedList<Person> list2 = new LinkedList<>();


      // Add Person objects to list1
        list1.add(new Person("Anjali", 30));
        list1.add(new Person("Pushpanjali", 25));
        list1.add(new Person("Piyush", 35));


      // Add Person objects to list2
        list2.add(new Person("Trapti", 40));
        list2.add(new Person("Manorama", 28));
        list2.add(new Person("Annapurna", 33));

        System.out.println("Values of list1 : "+list1);
        System.out.println("Values of list2 : " +list2);

System.out.println("----------------------------------------------------------");      

      // Merge list2 and list1
    
        list1.addAll(list2);
        System.out.println("Values of merged list:"+ list1);

System.out.println("----------------------------------------------------------");

      // Sort the merged LinkedList by age using a custom comparator
      Collections.sort(list1, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    });
      System.out.println("Values of Sorted list : " + list1);

System.out.println("----------------------------------------------------------");

      // Reverse the sorted LinkedList
        Collections.reverse(list1);
        System.out.println("Reverse the list : "+ list1);

System.out.println("----------------------------------------------------------");

        // Iterate through the list using an Iterator and print each person object
        Iterator<Person> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

System.out.println("----------------------------------------------------------");

         // Check if the list contains a person with name "Anjali" and age 30
         Person target = new Person("Anjali", 30);
         boolean containsAnjali = list1.contains(target);
         System.out.println("Does the list contain Anjali (30)? : " + containsAnjali);

System.out.println("----------------------------------------------------------");

          // Remove all persons where age is less than 30
        iterator = list1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() < 30) {
                iterator.remove();
            }
        }
        System.out.println("After removing persons with age less than 30 : "+ list1);

System.out.println("----------------------------------------------------------");       

        // Clear all elements from the list
        list1.clear();
        System.out.println("After clearing all elements : " +list1);
       
    }
}
