package Inheritance;

public class Samsung extends Phone{
    public static void main(String[] args) {
        Samsung mob1 = new Samsung();
        mob1.imei = 987092182;
        mob1.make = "Samsung";
        mob1.model = "Note";
        mob1.makecalls();
    }
}
