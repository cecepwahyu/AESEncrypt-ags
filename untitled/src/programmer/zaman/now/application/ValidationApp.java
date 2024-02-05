package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid!");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid!");
//        } catch (ValidationException e) {
//            System.out.println("Data tidak valid : " + e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("Data null : " + e.getMessage());
//        }

    }
}
