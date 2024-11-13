package homework_45;

public class PasswordValidator {

    public static void isPasswordValid(String password) throws PasswordlValidateException {

        //1. длина >= 8

        if (password.length() < 8 )  throw new PasswordlValidateException("length < 8 = error");

        //2. Должна быть мин 1 цифра

        for(int i = 0; i < password.length();  i++) {
            if(!Character.isDigit(password.charAt(i))) {
                throw new PasswordlValidateException("number must be ");
            }
        }

        //3. Должна быть мин 1 маленькая буква

        for(int i = 0; i < password.length(); i++) {
            if(!Character.isLowerCase(password.charAt(i))) {
                //task3 = true;
                throw new PasswordlValidateException("small letter must be ");
            }
        }

        // 4. Должна быть мин 1 большая буква

        for(int i = 0; i < password.length(); i++) {
            if(!Character.isUpperCase(password.charAt(i))) {
                throw new PasswordlValidateException("capital letter must be ");
            }
        }

        //5. Должeн быть мин 1 спец. символ (!%$@&*()[].,-)

        for(int i = 0; i < password.length() ; i++) {
            char c = password.charAt(i);
            if ( c == '!' ||  c == '%' || c == '$' || c == '&' || c == '*' || c == '('
                    ||  c == ')' || c == '[' ||  c == ']' ||  c == '-' || c == ',' || c == '.' || c == '@') {

            }else throw new PasswordlValidateException("special character must be ");
        }
    }
}
