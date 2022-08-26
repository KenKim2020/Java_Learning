package java_data_types;

public class Day15_GlobalVariables {

    String environment = "qa.codegator.us";
    String username = "test@gmail.com";

    public static void main(String[] args) {
        Day15_GlobalVariables day01 = new Day15_GlobalVariables();
        System.out.println(day01.environment);

        Day15_GlobalVariables day02 = new Day15_GlobalVariables();
        System.out.println(day02.environment);

        day02.environment = "qa1.codegator.us";

        System.out.println("After initializing new value: " );
        System.out.println(day02.environment);

        System.out.println(day01.environment);
    }
}
