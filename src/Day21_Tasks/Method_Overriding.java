package Day21_Tasks;

import java.lang.reflect.Method;

class SSN {
    int mySSN = 123456789;
    void usersSSN() {
        System.out.println("This is my SSN" + mySSN);
    }
}
public class Method_Overriding extends SSN{

    void usersSSN() {
        System.out.println("I cannot share this info");
    }

    public static void main(String[] args) {

        Method_Overriding a = new Method_Overriding();
        a.usersSSN();
    }
}
