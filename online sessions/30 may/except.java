
import java.math.BigInteger;
import java.util.List;
import java.util.Arrays;
public class except{
    public static void main(String[] args) {
        // System.out.println(hello)
        // System.out.println(hello);
        // System.out.println("hello");
    //    print ("hello");
        
                //--------ArithmetricException(Logical error)----//
                
        // int a =45;
        // int b =0;
        // int c = a/b;
        // System.out.println(c);

                //----------NullPointerException-----------//

        // String a = null;
        // System.out.println(a.length());

                //----------Date Exception----------------//

        // Date a =new Date();

                //-----------ArrayIndexOutOfBoundsException--------//

        // int[] a = {3,6,7};
        // System.out.println(a[3]);

                //----------ArrayStoreException----------//

        // Number[] bigint = new BigInteger[5];
        // bigint[0]= Double.valueOf(123.76446);

                //-----------UnsupportedOperationException---------//

        Integer[] a = {3,5,7,1,8};
        List<Integer> b = Arrays.asList(a);
        b.add(new Integer(0));



    } 
}