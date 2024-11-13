package homework_45;

public class ValidateApp {
    public static void main(String[] args) {

        String email = "test@email.com";

        try {
            EmailValidator.isEmailValid(email);

            System.out.println(" all gut");
        } catch (EmailValidateException e) {

            System.out.println(" Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }


             String password = "leffl-7dL-@d";

        try {
            PasswordValidator.isPasswordValid(password);

            System.out.println(" all gut");
        } catch (PasswordlValidateException p) {

            System.out.println(" Password is not valid");
            String message = p.getMessage();
            System.out.println(message);
        }

    }
}
