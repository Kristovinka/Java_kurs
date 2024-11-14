package homework_46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

/*
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */

public class HomeWork {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2001, Month.MARCH, 5);

        System.out.println("текущий год, месяц и день: " + date);
        System.out.println("текущая дата: " + date.getDayOfMonth());
        System.out.println("день рождения: " + specificDate);
        System.out.println("проверить на равенство: " + specificDate.equals(date));

        LocalTime time = LocalTime.now();
        System.out.println("текущее время: " + time);
        System.out.println("текущее время + 3 часа: " + time.plusHours(3));

        System.out.println("дата, которая на неделю позже сегодняшней: " + date.plusWeeks(1));
        System.out.println("дата, которая была на год раньше сегодняшней: " + date.minusYears(1));
        System.out.println("дата, которая на год позже сегодняшней: " + date.plusYears(1));

        //tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);

        System.out.println("tomorrow.isBefore(date): " + tomorrow.isBefore(date));
        System.out.println("date.isAfter(yesterday): " + date.isAfter(yesterday));

        List<LocalDate> list = List.of(date, tomorrow, yesterday);
       // List<LocalDate> list = List.of();
        System.out.println( "количество дней: " + method(list));
    }



//    Task 2
//    Написать метод, принимающий список из нескольких дат типа LocalDate и
//    возвращающий количество дней между самой ранней и поздней датами в этом списке

    public static Long method (List<LocalDate> dates){

        if (dates.isEmpty()) {
            System.out.println("список пуст!!!");
            return null;
        }

        Optional<LocalDate> latestDate = dates.stream()
                .max(LocalDate::compareTo);

        System.out.println("самая поздняя дата: " + latestDate);

        Optional <LocalDate> earliestDate = dates.stream()
                .min(LocalDate::compareTo);

        System.out.println("самая ранняя дата: " + earliestDate);


        return ChronoUnit.DAYS.between(earliestDate.get(), latestDate.get());

    }
}
