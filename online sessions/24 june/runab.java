class A implements Runnable{
    public void run(){
        // System.out.println("Thread - 1 - A");

//-------for loop---------------//

        for(int i = 1; i<= 5; i++)
        System.out.println("Thread - 1 - A");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class B implements Runnable{
    public void run(){
        // System.out.println("Thread - 2 - B");

        for(int i = 1; i<=5; i++){
        System.out.println("Thread - 2 - B"); 
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}


public class runab {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);
        t1.start();
        t2.start();
    }
}
