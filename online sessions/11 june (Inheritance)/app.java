


// class Addition extends Substraction{
//     public int add(int a, int b){
//         return a+b;
//     }
// }
// class Substraction extends Division{
//     public int sub(int a, int b){
//         return a-b;
//     }

// }

// class Division extends Multiple{
//     public int div(int a, int b) {
//         return a/b;
//     }
// }

// class Multiple{
//     public int multi(int a, int b){
//         return a*b;
//     }
// }

import calc.Addition;

public class app{
    public static void main(String[] args) {
        Addition obj = new Addition();
        int add = obj.add(2,4);
        int sub =obj.sub(4,1);
        int div = obj.div(4,2);
        int multi =obj.multi(4,3);

        System.out.println("Addition of 2 and 4: "+add);
        System.out.println("Substraction of 4 and 1: "+sub);
        System.out.println("Division of 4 and 2: "+div);
        System.out.println("Multiple of 4 and 3: "+multi);

    
    }
}