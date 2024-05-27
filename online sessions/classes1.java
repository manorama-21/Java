class math{
    public int addi(int a, int b){
        return a+b;
    }
}


public class classes1 {
    public static void main(String[] args) {
        math a1 = new math();
        
        int z = a1.addi(2,6);
        System.out.println(z);
    }
}
