package task3;

import java.util.InputMismatchException;

public class Main {
    //    Создать обобщенный функциональный интерфейс. Написать класс с одним методом.
//    В этом методе реализуйте логику:
//    - если в консоль введена цифра 1, то: использования интерфейса со строковым типом
//    и передать в метод интерфейса логику реверса строки (вывода строки в обратном порядке).

    public static void main(String[] args) {

        Logic<Object> str = new Logic<>();

        try {
            str.method("Hello, I'm Java Developer");
        } catch (InputMismatchException e) {
            System.out.println("Entered not a number");
        }

    }
}
