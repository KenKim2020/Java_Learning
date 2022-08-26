package java_data_types;

public class Day24_MoreStrings {
    public static void main(String[] args) {

        // Using Concatenation with String
        String fname = "Ken";
        String lname = "Kim";
        String fullname = fname.concat(lname);
        System.out.println(fullname);

        // Using Trim with String
        String day = "   Today we are learning Strings   ";
        day = day.trim();
        if (day.equals("Today we are learning Strings")) {
            System.out.println("Yayy, the string value matched.");
        } else {
            System.out.println("The value does not match");
        }

        // Using StartsWith
        String transaction = "$50.00";
        boolean dollarSymbol = transaction.startsWith("$");
        if (dollarSymbol) {
            System.out.println("The prefix is present");
        } else {
            System.out.println("It is not present");
        }

        // Using EndsWith
        boolean stringPresent = day.endsWith("Strings");
        System.out.println(stringPresent);//true

        // Using Char
        char ret = transaction.charAt(0);
        System.out.println(ret);

        // Using IndexOf
        System.out.println(transaction.indexOf('5'));
        String email = "Hello123@gmail.com";
        System.out.println(email.indexOf('@'));

        // Using Substring
        System.out.println(email.substring(8));
        System.out.println(email.substring(0,8));

        // Using Replace
        String title = "Welcome to the Car dealer$hip";
        System.out.println(title);
        title = title.replace("$","s");
        System.out.println(title);


    }
}
