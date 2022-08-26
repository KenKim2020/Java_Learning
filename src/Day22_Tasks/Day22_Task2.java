package Day22_Tasks;

/*Create an abstract class 'Bank' with an abstract method 'getBalance'.
$100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
Call this method by creating an object of each of the three classes.*/

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    int a = 100;

    void getBalance() {
        System.out.println("Your balance is: " + a);
    }
}

class BankB extends Bank {
    int a = 150;

    void getBalance() {
        System.out.println("Your balance is: " + a);
    }
}

class BankC extends Bank {
    int a = 200;

    void getBalance() {
        System.out.println("Your balance is: " + a);
    }
}

public class Day22_Task2 {
    public static void main(String[] args) {
        BankA a = new BankA();
        a.getBalance();
        BankB b = new BankB();
        b.getBalance();
        BankC c = new BankC();
        c.getBalance();
    }

}
