package homework_45;

public class PasswordlValidateException extends Exception{

    public PasswordlValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception|" + super.getMessage();
    }
}
