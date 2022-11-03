package task1;

import java.time.LocalDate;

public class Main {
// Написать программу для вывода на консоль названия дня недели по введенной дате.

    public static void main(String[] args) {

        NameOfTheDay day = new NameOfTheDay(LocalDate.of(2022, 11, 2));
        day.showDayOfWeek();
    }
}