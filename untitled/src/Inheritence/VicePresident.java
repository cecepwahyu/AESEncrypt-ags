package Inheritence;

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Vice President " + this.name);
    }
}
