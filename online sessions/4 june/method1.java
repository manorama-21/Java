class Students{

    static String name;
    public static void show(Students students){
        System.out.println(Students.name);
    }
}

public class method1 {
    public static void main(String[] args) {
        Students adit = new Students();
        // adit.name="Manu";

        Students cts = new Students();
        cts.name="Kuku";

        Students cits = new Students();
        // cits.name ="sak";


        // adit.show();
        // cts.show();
        // cits.show();
        cts.show(adit);

    }
}
