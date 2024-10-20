package homework_27;
//import org.apache.commons.lang3.StringUtils;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (isEmailValid(email)) {
            this.email = email;
        }
    }


    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */


    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        //Метод indexOf() возвращает индекс первого вхождения указанного значения в строковый объект String
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        // fromIndex  Местоположение внутри строки, откуда начинать поиск.
        if (dotIndexAfterAt == -1) return false;

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
        if (charAfterdot.length() < 2) return false;

       // 4. Алфавит, цифры, '-', '_', '.', '@'

        //     Тут выбирайте сами реализацию

        boolean allTasks = email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
        if (!allTasks) return false;
////////////////////////////////////////////////////////////////
        for(int i = 0; i < email.length() ; i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' && c != '.' && c != '@') {
                return false;
            }
        }

      //  5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) return false;

       // 6. Первый символ - должна быть буква
        int firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) return false;

        return true;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


private boolean isPasswordValid(String password) {
     //1. длина >= 8
    boolean task1 = false;
    if (password.length() >= 8 )  task1 = true;

    //2. Должна быть мин 1 цифра

    //StringUtils.isNumer(password)
   // boolean isNum = password.matches("-?\\d+");
    boolean task2 = false;

    for(int i = 0; i < password.length() && !task2; i++) {
        if(Character.isDigit(password.charAt(i))) {
            task2 = true;
        }
    }

    //3. Должна быть мин 1 маленькая буква

    boolean task3 = false;

    for(int i = 0; i < password.length() && !task3; i++) {
        if(Character.isLowerCase(password.charAt(i))) {
            task3 = true;
        }
    }

    // 4. Должна быть мин 1 большая буква
    boolean task4 = false;

    for(int i = 0; i < password.length() && !task4; i++) {
        if(Character.isUpperCase(password.charAt(i))) {
            task4 = true;
        }
    }

    //5. Должeн быть мин 1 спец. символ (!%$@&*()[].,-)
    boolean task5 = false;
    for(int i = 0; i < password.length() ; i++) {
        char c = password.charAt(i);
        if ( c == '!' ||  c == '%' || c == '$' || c == '&' || c == '*' || c == '('
                ||  c == ')' || c == '[' ||  c == ']' ||  c == '-' || c == ',' || c == '.' || c == '@') {
            task5 = true;
        }
    }

    return task1 && task2 && task3 && task4 && task5;
    }
}

/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */