import java.time.LocalDate;
import java.time.LocalTime;

public class datetime {
    public static void main(String[] args) {
//----------------current date------------//
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println("Current Date: "+myObj); 


//---------------current time-------------//
    LocalTime myObj1 = LocalTime.now();
    System.out.println("Current Time: "+myObj1);
    }
}
