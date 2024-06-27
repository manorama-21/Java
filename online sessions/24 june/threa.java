class thread1 extends Thread{
    public void run (){
    //     System.out.println("thread1");
    for(int i = 0; i<= 5; i++){
        System.out.println("Thread1");

//------ sleep mode-------//
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     }
}

class thread2 extends Thread{
    public void run() {
        // System.out.println("thread2");
        for(int i = 0; i<= 5; i++){
            System.out.println("Thread2");

//---- sleep mode-------//
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threa {
    public static void main(String[] args) {
        thread1 obj = new thread1();
        obj.run();

        thread2 obj1 = new thread2();
        obj1.run();

    }
}
