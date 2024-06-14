class adit1{
    private String name;
    private int age;

//-------------------setters-----------//

public void setName(String name){
    this.name = name;
    
}

public void setAge(int age){
    this.age = age;
    
}


//--------------------getters-----------//
     public String getName(){
        return name;
     }

     public int getAge(){
        return age;
     }
}

public class setget {
    public static void main(String[] args) {
        adit1 student = new adit1();
        student.setName("manu");
        student.setAge(21);

        System.out.println(student .getName());
        System.out.println(student .getAge());
    }
}
