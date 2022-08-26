package Day21_Tasks;

class a {
    int a = 10;
    int b = 20;
    void add() {
        System.out.println(a + b);

    }
}

class b extends a {
    int a = 20;
    int b = 20;

    void add() {
        System.out.println(a + b);
    }
}
class c extends b {
    int a = 30;
    int b = 20;
    int d = a + b;
    void add() {
        System.out.println(a + b);
}

}
public class Multi_Level_Inheritance extends c {
    public static void main(String[] args) {
        c hello = new c();
        hello.add();
    }
}
