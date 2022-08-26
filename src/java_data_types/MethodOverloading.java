package java_data_types;

public class MethodOverloading {
    public static void main(String[] args) {

        addition(10,20);
        addition(5,4,3);
        addition(2,5.23f);
        addition("Hello", "World");

    }

    // Method Overloading by changing the number of parameters
    static void addition(int a, int b) {
        System.out.println(a + b);
    }

    static void addition(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    // Method Overloading by changing the type of variable
    static void addition(int a, float b) {
        System.out.println(a + b);
    }
    static void addition(String a, String b) {
            System.out.println(a + b);
    }

}
