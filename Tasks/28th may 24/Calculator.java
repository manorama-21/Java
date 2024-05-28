public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber =a.nextInt();

        System.out.println("Enter second number");
        int secondNumber = a.nextInt();

        System.out.println("Enter operator(+, -, *, /):");
        String operator =a.next();
        int result = useOperation(firstNumber, secondNumber, operator);
        System.out.println("Your answer is :"+ result);
    }

    public static int useOperation(int  firstNumber, int secondNumber, String operator) {

        int result = 0;
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
       
        }
        else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }

    }

