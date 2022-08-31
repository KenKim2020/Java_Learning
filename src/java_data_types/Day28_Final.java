package java_data_types;

class example1 {
    final int a = 10;
    final String api = "ABAKJDFL124214515";

    final void methodOne() {
        System.out.println("This is methodOne from example1 class " + a);
    }
}

/*
If you have a final keyword with the class you cannot perform inheritance
If you have a final keyword with the variable you cannot re-initialize a new value
If you have a final keyword with the method you cannot perform overriding
 */

class example4 {
    int a = 100;
    void methodOne() {
        System.out.println("This is methodOne from example4 class");
    }
}

public class Day28_Final {
    public static void main(String[] args) {
        example4 ex = new example4();
        ex.methodOne();
    }
}
