package java_data_types;

import java.sql.SQLOutput;

public class Day25_MoreStrings {
    public static void main(String[] args) {
        String words = "!#@43@#$#2jdfjasjfoi44514325()*U():(*U1241;4214";
        String noNumbers = words.replaceAll("[0-9]","");
        System.out.println("After removing [0-9] numbers: " + words);
        System.out.println("After removing [0-9] numbers: " + noNumbers);

        String noUpperCase=words.replaceAll("[A-Z]","");
        System.out.println("After removing [A-Z] characters : "+noUpperCase);

        String noLowerCase = words.replaceAll("[a-z]", "");
        System.out.println("After removing [a-z] characters :"+noLowerCase);

        String onlySpecialCharacters = words.replaceAll("[A-Za-z0-9]","");
        System.out.println("This will show special characters only : "+ onlySpecialCharacters);

        String showNumbersOnly = words.replaceAll("[^0-9]", "");
        System.out.println(showNumbersOnly);

        String showUpperCaseOnly = words.replaceAll("^[A-Z]", "");
        System.out.println(showUpperCaseOnly);

        String showLowerCaseOnly = words.replaceAll("[^a-z]","");
        System.out.println(showLowerCaseOnly);



    }
}
