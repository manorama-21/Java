
abstract class Car{
    abstract void start();

    public void ac(){
        System.out.println("AC is On");
    }
    abstract void stop();

}

class maruti extends Car{
    public void start(){
        System.out.println("Car is started");
    }

    public void stop(){
        System.out.println("Car is stopped");
    }
}


public class interface1 {
    public static void main(String[] args) {
        Car c = new maruti();
        c.start();
        c.ac();
        c.stop();
    }
   
}
