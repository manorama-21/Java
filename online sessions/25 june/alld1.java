//---------functinal interface-----------//

interface A{
    int mathy(int a, int b, int c);

}

public class alld1 {
    public static void main(String[] args) {
    //-----object------//
        A obj = (a, b, c) -> a+b+c;
         int res=obj.mathy(1, 2, 3);
        System.out.println(res);


//------lamda function-------//
        A obj1 =new A(){
            public int mathy(int a, int b, int c){
                return a+b+c;
            }
        };
        int res1=obj1.mathy(10, 20, 0);
        System.out.println(res1);
        
    }
}
