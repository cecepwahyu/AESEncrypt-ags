package programmer.zaman.now.application;

import java.util.EnumSet;

public class EnumSetApp {

    public  static enum Gender {
        MALE,
        FEMALE,
        NOT_MENTIONED
    }

    public static enum Nationality {
        INDONESIA,
        MALAYSIA,
        SINGAPORE,
        BRUNEI,
        PHILIPPINES
    }

    public static void main(String[] args) {

        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
        EnumSet<Nationality> nationalities = EnumSet.allOf(Nationality.class);

        for (var gender : genders) {
            System.out.println(gender);
        }

        for(var nationality : nationalities) {
            System.out.println(nationality);
        }
    }




}
