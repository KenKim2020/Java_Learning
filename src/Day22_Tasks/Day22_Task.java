package Day22_Tasks;

abstract class Shape {
    abstract int RectangleArea(int a, int b);
    abstract int SquareArea(int c);
    abstract double CircleArea(int d);
}

class Area extends Shape{

    int RectangleArea(int a, int b) {
        int RectangleAreaAnswer = a * b;
        return RectangleAreaAnswer;
    }

    int SquareArea(int c) {
        int SquareAreaAnswer = c * c;
        return SquareAreaAnswer;
    }

    double CircleArea(int d) {
        double CircleAreaAnswer = (3.14*(d*d));
        return CircleAreaAnswer;
    }
}
public class Day22_Task extends Area{
    public static void main(String[] args) {

        Area HP = new Area();
        System.out.println(HP.CircleArea(3));
        System.out.println(HP.RectangleArea(4,6));
        System.out.println(HP.SquareArea(5));
    }

}
