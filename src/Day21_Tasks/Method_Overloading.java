package Day21_Tasks;
class New_Methods {
    void NewTest (){
        System.out.println("This does nothing right now");
    }

    void NewTest(int a) {
        System.out.println(a);
    }
}



public class Method_Overloading {
    public static void main(String[] args) {
        New_Methods c = new New_Methods();
        c.NewTest(20);
    }
}
