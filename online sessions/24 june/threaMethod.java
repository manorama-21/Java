class thread1 extends Thread{
    public void run (){
//------------------Methods-----------------//
        System.out.println(currentThread());
        System.out.println(currentThread().getName());
        System.out.println(currentThread().getPriority());
        System.out.println(currentThread().threadId());
        System.out.println(currentThread().getClass());
        System.out.println(currentThread().getState());


     }
}
class thread2 extends Thread{
    public void run() {
         System.out.println(currentThread());
       
    }
}
class thread3 extends Thread{
    public void run() {
         System.out.println(currentThread());
       
    }
}

public class threaMethod {
    // public static void main(String[] args) {
    //     thread1 obj = new thread1();
    //     obj.start();

    //     thread2 obj1 = new thread2();
    //     obj1.start();

    //     thread3 obj2 = new thread3();
    //     obj2.start();


    // }


//---------------Max Priority------------//
    // public static void main(String[] args) {
    //     thread1 obj = new thread1();
    //     obj.start();
    //     obj.setPriority(Thread.MAX_PRIORITY);

    //     thread2 obj1 = new thread2();
    //     obj1.start();

    //     thread3 obj2 = new thread3();
    //     obj2.start();
    //     }


//-------------Min Priority----------------//

// public static void main(String[] args) {
//         thread1 obj = new thread1();
//         obj.start();
//         obj.setPriority(Thread.MIN_PRIORITY);

//         thread2 obj1 = new thread2();
//         obj1.start();

//         thread3 obj2 = new thread3();
//         obj2.start();
//         }


//------------------current Methods----------------//
public static void main(String[] args) {
            thread1 obj = new thread1();
            obj.start();
    }


}
