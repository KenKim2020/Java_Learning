package java_data_types;

public class Day25_Tasks {
    public static void main(String[] args) {

        Day25_Tasks a = new Day25_Tasks();
        a.extractChar("Hello this is a test sentence");
        System.out.println(noSpaceSentence("Create a method that will take 1 String sentence as a parameter. Inside your method write a code that should return a String without any spaces."));
        System.out.println(returnNumberOfCharacters("1234567890ahbjshdjsdbASYFEUYUWE^%$#@$%!"));
        String a1 = "Today is a good day. It is Thursday. We have a Java Class. How would you find out how many sentences are in that String?";
        String[] sen = a1.split("\\.");
        System.out.println(sen.length);
    }

    void extractChar (String userInput) {

        // char array method
        char[] characters = userInput.toCharArray();
        for(int i = 0;i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }




    public static String noSpaceSentence(String sentence) {
        return sentence.replaceAll(" ", "");
    }

    public static int returnNumberOfCharacters(String words) {
        String specialCharacters = words.replaceAll("[A-Za-z0-9]", "");
        int specialCharacterCount = specialCharacters.length();
        return specialCharacterCount;
    }
}
