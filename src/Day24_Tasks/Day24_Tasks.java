package Day24_Tasks;


//Task 1. Create a method that will take 1 parameter as a String. If the String has odd number of characters and has 3 or more characters, print the character in the middle of the String.
//Task 2. Create a method that will take 1 parameter as a String. If the String has an even number of characters and has 5 or more characters, print the middle two characters of the String.
//Task 3. Create a method that will take 2 parameters as a String(actualValue, expectedValue). Your method should return boolean value verifying whether given two strings are equal or not

public class Day24_Tasks {
    public static void main(String[] args) {

        Day24_Tasks a = new Day24_Tasks();
        a.task1("Veronicas");
        a.task2("Kenneth");
        System.out.println(a.task3("Kenneth","Jack"));
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void task1(String userInput) {


        if (userInput.length() >= 3 && userInput.length() % 2 == 1) {
            int chosenIndex = userInput.length()/2;

            System.out.println(userInput.charAt(chosenIndex));
        } else {
            System.out.println("Your string has even number of characters or is no more than two characters long");
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void task2(String userInput) {


        if (userInput.length() >= 5 && userInput.length() % 2 == 0) {
            int chosenIndex = userInput.length()/2;
            System.out.println(userInput.substring(chosenIndex-1,chosenIndex+1));
        } else {
            System.out.println("Your string has odd number of characters or is no more than 5 characters long");
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    boolean task3(String actualValue, String expectedValue) {
        boolean answer = actualValue.equals(expectedValue);
        return answer;

    }
}

