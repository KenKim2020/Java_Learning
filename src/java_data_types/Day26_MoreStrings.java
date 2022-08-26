package java_data_types;

public class Day26_MoreStrings {
    public static void main(String[] args) {

        // Simple Example
        String a = "Hello";
        String b = a + " World";
        System.out.println(b);

        // Creating an Oject of the Class
        StringBuffer aa = new StringBuffer("Hello");

        // Using the method Append
        aa.append(" World");
        aa.append(" Today we are learning String Buffer");
        System.out.println(aa);

        // Using the method Insert
        aa.insert(5, ' ');
        System.out.println(aa);
        aa.insert(11, '.');
        System.out.println(aa);
        aa.insert(0,"Good Evening.");
        System.out.println(aa);

        // Using the method reverse
        aa.reverse();
        System.out.println(aa);
        aa.reverse();
        System.out.println(aa);
        aa.delete(12,24);
        System.out.println(aa);
        aa.deleteCharAt(12);
        System.out.println(aa);
        aa.replace(5,12,"Morning ");
        System.out.println(aa);
    }

}
