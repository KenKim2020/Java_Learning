package java_data_types;

abstract class Furniture {

    abstract void color(); // Abstract Method
    abstract void material();
    abstract void weight();
}

abstract class chair extends Furniture {

    void color() {
        System.out.println("This is a color method");
    }

    void material() {
        System.out.println("This is a material method");
    }

    abstract void dimension();

}

class brand extends chair {
    void dimension() {
        System.out.println("This is a dimension method");
    }
    void weight() {
        System.out.println("This is a weight method");
    }
}
public class Day20_Abstract_Class {
    public static void main(String[] args) {
        brand b = new brand();
        b.color();
        b.dimension();
        b.weight();
        b.material();
    }
}
