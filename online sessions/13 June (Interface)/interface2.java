interface  vericle{
    public void road(){
        // System.out.println("Running intrument");
    }
}

class bus implements vericle{
    public void road(){
        System.out.println("Running vericle");
    }
}

class bike implements vericle{
    public void road(){
        System.out.println("Running vericle");
    }
}

public class interface2 {
    public static void main(String[] args) {
        vericle bus = new bus();
        vericle bike = new bike();
    }
}
