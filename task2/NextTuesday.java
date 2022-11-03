package task2;

import java.time.LocalDate;

public class NextTuesday {
    private final LocalDate date;

    public NextTuesday(LocalDate date) {
        this.date = date;
    }

    public LocalDate findDateOfNextTuesday() {
        LocalDate dateOfTuesday = date;
        do {
            dateOfTuesday = dateOfTuesday.plusDays(1);
        } while (!dateOfTuesday.getDayOfWeek().toString().equalsIgnoreCase("Tuesday") || dateOfTuesday.getDayOfYear() - date.getDayOfYear() <= 1);
        return dateOfTuesday;
    }
}
