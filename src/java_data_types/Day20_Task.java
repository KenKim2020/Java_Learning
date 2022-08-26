package java_data_types;
//Create an abstract parent class
//The parent class should have 2 abstract methods
//Create an abstract child class which extends the abstract parent class
//Add 1 abstract method in the child class
//Create another concrete method which implements all the abstract methods
//In your original class(Bottom) within the main method create
//an object directly and access all the methods

abstract class Parent {
    abstract void firstName();
    abstract void lastName();
}

abstract class Child extends Parent{
    abstract void childFirstName();
}

class controlMethod extends Child {
    void firstName() {
        System.out.println("Your first name is Ken");
    }

    void lastName() {
        System.out.println("Your last name is kim");
    }

    void childFirstName() {
        System.out.println("Your child's name is Jake");
    }
};


public class Day20_Task {

    public static void main(String[] args) {
       controlMethod a = new controlMethod();
       a.firstName();
       a.lastName();
       a.childFirstName();
    }
}
