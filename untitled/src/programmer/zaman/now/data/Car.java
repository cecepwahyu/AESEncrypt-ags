package programmer.zaman.now.data;

public interface Car extends HasBrand {

    void drive();

    int getTire();

    default boolean isBig() {
      return false;
    }
}
