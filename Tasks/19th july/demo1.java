public class demo1 {
    public static void main(String[] args) {
        // int number = 15;
        // for (int i = 5; i >= 1; i--) { 
        //     for (int j = 1; j <= i; j++) {  
        //         System.out.print(number + " ");
        //         number--;
        //     }
        //     System.out.println();  
        // }


        int[][] numGroups = {
            {11, 12, 13, 14, 15},
            {7, 8, 9, 10},
            {4, 5, 6},
            {2, 3},
            {1}
        };

        for (int[] group : numGroups) {
            for (int number : group) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
