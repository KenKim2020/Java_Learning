package java_data_types;

public class Day25_MoreStrings2 {


    public static void main(String[] args) {

        // char array method
        String name = "Hello World";
        char[] characters = name.toCharArray(); // {H,e,l,l,o, w,o,r,l,d}
        System.out.println(characters.length);

        // allows you to print vertically
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        // splits the sentences at the " "'s and stores it in an array
        String sentence = "Hello today we are learning more Strings.";
        String[] results = sentence.split(" ");
        for(int i = 0;i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
