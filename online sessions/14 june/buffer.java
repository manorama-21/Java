import java.nio.IntBuffer;

//----buffer ek logic hai jo khud hi apne me class hai---//

public class buffer {
    public static void main(String[] args) {
        IntBuffer obj = IntBuffer.allocate(4); // buffer apne ander 4 charater set ker sakta hi
        obj.put(2,10);
        System.out.println(obj);

        int[] arr = obj.array();
    

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
