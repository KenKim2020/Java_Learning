package java_data_types;

class Phone1 {
    String make = "Apple";
    String color = "Black";
}

class smartPhone extends Phone1 {
    String make = "Samsung";

    void displayChildMake() {
        System.out.println("The phone is " + make);
        System.out.println("The color is " + color);
    }

    void displayParentMembers() {
        System.out.println("This will print parent members: " + super.color);
    }
}

public class Day19_Super {
    public static void main(String[] args) {
        smartPhone a = new smartPhone();
        a.displayChildMake();
        a.displayParentMembers();
    }
}
