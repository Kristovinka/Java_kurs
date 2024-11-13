package lesson_45.validator;

public class PasswordlValidateException extends Exception{

    public PasswordlValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception|" + super.getMessage();
    }
}
