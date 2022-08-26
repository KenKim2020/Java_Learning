package Inheritance;

public class Phone {
    int imei = 333333333;
    String make;
    String model;
    String color;
    int memory;
    String camera;

    void makecalls() {
        System.out.println("IMEI :" + imei + "\nMake: " + make + "\nModel: " + model + "\nColor :" + color + "\nMemory: " + memory + "\nCamera: " + camera);
    }
}
