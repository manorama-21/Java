public class buffer {
    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("Manu");
        System.out.println(a.capacity());


                //........methods......//

        //...Append...//

    // a.append(" is great.");
    // System.out.println(a);
   
    // a.append("Long live India.");
    // System.out.println(a);


        //..Delete...//

    // a.deleteCharAt(3);
    // System.out.println(a);


        //...Insert...//

    a.append(" Saroj");
    a.insert(10, " Developer");
    System.out.println(a);



   

    }
}
