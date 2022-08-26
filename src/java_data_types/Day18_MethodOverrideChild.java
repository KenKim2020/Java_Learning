package java_data_types;

public class Day18_MethodOverrideChild extends Day18_MethodOverrideParent{
    public static void main(String[] args) {

        Day18_MethodOverrideChild a = new Day18_MethodOverrideChild();
        a.openbrowser();
        a.closeBrowser();
    }

    public void openbrowser() {
        System.out.println("Open Firefox browser");
        System.out.println("Visit the website");
        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click the login button");
    }
}
