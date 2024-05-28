public class Circle {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
        
        System.out.println("Enter radius value "  );
        int radius = a.nextInt();

        System.out.println("Area of Circle : " + (Math.PI*radius*radius));

    }
}
