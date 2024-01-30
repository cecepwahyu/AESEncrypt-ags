package programmer.zaman.now.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTire() {
        return 6;
    }

    public String getBrand() {
        return "Mercy";
    }

    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return false;
    }
}
