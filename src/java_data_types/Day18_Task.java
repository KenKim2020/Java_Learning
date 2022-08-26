package java_data_types;

import java.util.Scanner;

public class Day18_Task {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What type of calculation would you like to perform? \n1. Addition \n2. Subtraction \n3. Division \n4. Multiplication");
        int actionCalc = userInput.nextInt();

        System.out.println("How many numbers would you like to calculate?");
        int numQuantity = userInput.nextInt();

      int [] numArray = new int[numQuantity];

      for(int i = 0; i == numArray.length; i++) {
          System.out.println("What is your " + (i+1) + " number?");
          numArray[i] = userInput.nextInt();
      }


    }
}
