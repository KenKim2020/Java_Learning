package java_data_types;

public class Day15_GlobalVariable_Examples {
    // Global Variable
    String phone = "Iphone";
    String color = "Black";
    static int memory = 32;
    public static void main(String[] args) {
        Day15_GlobalVariable_Examples johnPhone = new Day15_GlobalVariable_Examples();
        System.out.println(johnPhone.phone);
        System.out.println(johnPhone.color);
        System.out.println(johnPhone.memory);
        
        Day15_GlobalVariable_Examples stevePhone = new Day15_GlobalVariable_Examples();
        stevePhone.phone = "Iphone13";
        stevePhone.color = "Red";
        stevePhone.phone = "Iphone14";
        System.out.println(stevePhone.phone);
        System.out.println(stevePhone.color);
        System.out.println(stevePhone.memory);

        System.out.println("************Mike Phone**********");
        Day15_GlobalVariable_Examples mikePhone = new Day15_GlobalVariable_Examples();
        System.out.println(mikePhone.phone ); // Iphone
        System.out.println(mikePhone.color); // Black
        System.out.println(mikePhone.memory);

        Day15_GlobalVariable_Examples vinPhone = new Day15_GlobalVariable_Examples();
        vinPhone.possible();
    }

    public static void possible() {
        Day15_GlobalVariable_Examples vinPhone = new Day15_GlobalVariable_Examples();
        vinPhone.phone = "Iphone 12";
        vinPhone.color = "Grey";
        System.out.println(vinPhone.phone); // Iphone
        System.out.println(vinPhone.color); // Black

    }
}
