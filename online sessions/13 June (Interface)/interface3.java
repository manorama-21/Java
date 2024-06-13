interface maternal{
    void car();


}

interface paternal{
    void house();

    void car();

}

class child implements paternal, maternal{
    public void house(){
        System.out.println("Sweet Home");
    }
    public void car(){
        System.out.println("Farari");
    }
}
public class interface3 {
    public static void main(String[] args) {
        // maternal child;
        child c;
        c = new child();
        c.house();
        c.car(); 

    }
}
