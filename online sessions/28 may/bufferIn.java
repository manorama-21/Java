import java.io.*;

public class bufferIn {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = a.readLine();
        System.out.println("Your name is: "+ name );

        System.out.println("Enter your age:");
        // String age = a.readLine();
        int age1 = Integer.parseInt(a.readLine());
        System.out.println(2*age1 );

    
    }
}
