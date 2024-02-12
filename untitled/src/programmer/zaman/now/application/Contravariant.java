package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class Contravariant {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Cecep");
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Cecep");
    }

    public static void proses(MyData<? super Object> myData) {
        myData.setData(1);
    }
}
