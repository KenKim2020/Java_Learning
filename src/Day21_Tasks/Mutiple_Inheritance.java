package Day21_Tasks;
class Magic1 extends Mutiple_Inheritance{
    void Swing_Cut() {
        System.out.println("This is a Swing Cut");
        System.out.println(a+b);
    }


}

class Magic2 extends Mutiple_Inheritance{
    void Riffile_Shuffle(){
        System.out.println("This is a Riffle Shuffle");
        System.out.println(b+c);
    }

}

class Magic3 extends Mutiple_Inheritance{
    void Pharoh_Shuffle(){
        System.out.println("This is a Pharoh Shuffle");
        System.out.println(a+c);
    }
}

public class Mutiple_Inheritance {

    int a = 100;
    int b = 200;
    int c = 300;

    public static void main(String[] args) {
        Magic1 M1 = new Magic1();
        System.out.println(M1.a);
        M1.Swing_Cut();

        Magic2 M2 = new Magic2();
        System.out.println(M2.a);
        M2.Riffile_Shuffle();


        Magic3 M3 = new Magic3();
        System.out.println(M3.a);
        M3.Pharoh_Shuffle();




    }
}
