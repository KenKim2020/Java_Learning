package Day21_Tasks;

abstract class NewIdeas {
    abstract void frontPage();
    abstract void menuPage();
    abstract void loginPage();
    void homePage() {
        System.out.println("This is the home page");
    }
}


public class Abstract_Class extends NewIdeas {
    public static void main(String[] args) {
    Abstract_Class a = new Abstract_Class();
    a.frontPage();
    a.loginPage();
    a.menuPage();
    a.homePage();
    }

    @Override
    void frontPage() {
        System.out.println("Front Page");
    }

    @Override
    void menuPage() {
        System.out.println("Menu Page");
    }

    @Override
    void loginPage() {
        System.out.println("Login Page");
    }
}
