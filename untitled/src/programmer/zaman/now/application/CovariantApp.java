package programmer.zaman.now.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Cecep");
        process(stringMyData);

    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        //myData.setData(1); //TIDAK BOLEH
    }
}
