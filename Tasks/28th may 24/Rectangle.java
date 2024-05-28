public class Rectangle {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);

        int length, breadth, area;
        System.out.println("Enter length of rectangle: ");
        length = a.nextInt();

        System.out.println("Enter breadth of rectangle: ");
        breadth = a.nextInt();
         
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
