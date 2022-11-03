package task2;

import java.time.LocalDate;

public class Main {
    //  Написать программу для вывода на экран дату следующего вторника.

    public static void main(String[] args) {
        NextTuesday tuesday = new NextTuesday(LocalDate.of(2022, 11, 9));
        System.out.println(tuesday.findDateOfNextTuesday());
    }
}
