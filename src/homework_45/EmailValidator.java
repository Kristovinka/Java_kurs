package homework_45;

public class EmailValidator {

    public static void isEmailValid(String email) throws EmailValidateException {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        //Метод indexOf() возвращает индекс первого вхождения указанного значения в строковый объект String
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        // fromIndex  Местоположение внутри строки, откуда начинать поиск.
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

//        // Полезные методы класса Character
//        // isalpha() проверит, содержит ли данная строка только буквенно-цифровые значения
//        // Возвращает true если символ буква
//        Character.isAlphabetic('c');
//        // Возвращает true если символ цифра
//        Character.isDigit('1');
//        Character.isLetter('3');
        // isLetterOrDigit для определения того, является ли указанный символ буквой или цифрой
//        Character.isLetterOrDigit('-');

        //3. После последней точки есть 2 или более символов
        String charAfterdot = email.substring(dotIndexAfterAt + 1);
        if (charAfterdot.length() < 2) throw new EmailValidateException("last error");

        // 4. Алфавит, цифры, '-', '_', '.', '@'

        //     Тут выбирайте сами реализацию

        boolean allTasks = email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
        if (!allTasks) throw new EmailValidateException("illegal symbol");
////////////////////////////////////////////////////////////////
        for(int i = 0; i < email.length() ; i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' && c != '.' && c != '@') {
                throw new EmailValidateException("illegal symbol");
            }
        }

        //  5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) throw new EmailValidateException("@ should not first");;

        // 6. Первый символ - должна быть буква
        char firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) throw new EmailValidateException("first symbol should be alphabetic");;


    }
}
