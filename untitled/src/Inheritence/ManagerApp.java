package Inheritence;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Ilham");

        var vp = new VicePresident();
        vp.name = "Budi";
        vp.sayHello("Ilham");
    }
}
