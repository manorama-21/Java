import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;


public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();  //create a instance

        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Black");
        linkedList.add("Green");

        System.out.println("Initial LinkedList : " + linkedList);

//----------create in list form---------------//
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//-----------Add first and last element in list--------//
        linkedList.addFirst("White");
        linkedList.addLast("Orange");
        System.out.println("Updated LinkedLIst : "+ linkedList);



//-----------show first deleted element in list--------//
        String polledElement =linkedList.pollFirst(); //polled element means deleted element
        System.out.println("Deleted Element : "+ polledElement);

        System.out.println("Updated LinkedLIst : "+ linkedList);


//----------Alphabatic Order--------------------//
        Collections.sort(linkedList);  
        System.out.println("Sorted LinkedLIst : "+ linkedList);


//--------------customized sorting--------------//
        Collections.sort(linkedList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        });
        System.out.println("Reverse Sorted LinkedLIst : "+ linkedList);
        


//------------Add duplicate values------------//
        linkedList
        .add("Red");
        linkedList.add("Green");

        System.out.println("After Duplicacy : "+ linkedList);


//---------Remove value-------//
        linkedList.removeAll(Collections.singleton("Red"));
        System.out.println("After removing Red : "+ linkedList);


//--------------clear all value---------------//
       linkedList.clear();
       System.out.println("After Clear : "+ linkedList);

    }

  
}
