package Day21_Tasks;

class Child_Single_Inheritance {
    void myName() {
        System.out.println("My name is Ken");
    }
}

public class Single_Inheritance extends Child_Single_Inheritance{
    public static void main(String[] args) {
        Child_Single_Inheritance mn = new Child_Single_Inheritance();
        mn.myName();
    }
}
