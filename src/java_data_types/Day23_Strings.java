package java_data_types;

public class Day23_Strings {
    public static void main(String[] args) {

        String topic = new String("What is the topic we are learning today ?");
        int len = topic.length();
        System.out.println(len);
        String name = "John";
        String lastname = "King";
        System.out.println("This will print the length of name variable: " + name.length());
        System.out.println("This wil print the name variable: " + name);
        String lowerName = name.toLowerCase();
        System.out.println("Ths will convert the name variable to lowercase:" + lowerName); //John
        System.out.println(topic.toUpperCase());
        System.out.println("Using equalsignorecase: " + name.equalsIgnoreCase(lastname));
        System.out.println("Using equals method: " + name.equals(lastname));
        System.out.println(name.compareTo(lastname));
        System.out.println(name.compareToIgnoreCase(lastname));

        Day23_Strings a = new Day23_Strings();
        a.compareName("Kenneth", "Kim");


    }
    void compareName (String fName, String lName) {

                int result = fName.compareTo(lName);
                if(result >= 1){
                    System.out.println("The number is positive");

                } else if (result <= -1){
                    System.out.println("The value is negative");
                } else {
                    System.out.println("The number is zero");
                }
    }

}
