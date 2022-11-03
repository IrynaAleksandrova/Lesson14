package task1;

import java.time.LocalDate;

public class NameOfTheDay {
    private final LocalDate date;

    public NameOfTheDay(LocalDate date) {
        this.date = date;
    }

    public void showDayOfWeek() {
        System.out.println(date.getDayOfWeek().toString());
    }
}
