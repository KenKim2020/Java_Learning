package Day21_Tasks;

interface NewIdeas2{
    void frontPage();
    void menuPage();
    void loginPage();
    void homePage();
}


public class Interface implements NewIdeas2{
    @Override
    public void frontPage() {
        System.out.println("Front");
    }

    @Override
    public void menuPage() {
        System.out.println("Menu");
    }

    @Override
    public void loginPage() {
        System.out.println("Login");
    }

    @Override
    public void homePage() {
        System.out.println("Home");
    }

    public static void main(String[] args) {
        Interface a = new Interface();
        a.frontPage();
        a.homePage();
        a.loginPage();
        a.menuPage();
    }
}
