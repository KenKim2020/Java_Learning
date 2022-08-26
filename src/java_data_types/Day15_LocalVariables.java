package java_data_types;

public class Day15_LocalVariables {
    public static void main(String[] args) {
        // Local Variable
        int age = 10;
        String name = "John";
        float temp = 45.88f;

        System.out.println(age);
        System.out.println(name);
        System.out.println(temp);

        Day15_LocalVariables a = new Day15_LocalVariables();
        a.possible();

        if(true) {
            // Local Variable
            int b = 40;
            System.out.println(b);
        }
    }

    public static void possible() {
        // Local Variable
        String environment = "qa.codegator.us";
        String username = "test@gmail.com";
        String password = "Welcome1";

        System.out.println(environment);
        System.out.println(username);
        System.out.println(password);


    }
}
