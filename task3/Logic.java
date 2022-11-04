package task3;

import java.util.Scanner;

public class Logic<T> {
    public void method(T parameter) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number");
            if (scanner.nextInt() == 1) {
                FI<String> stringFI1 = () -> {
                    String newText;
                    StringBuilder sb = new StringBuilder((String) parameter);
                    newText = sb.reverse().toString();
                    System.out.println(newText);
                };
                stringFI1.getLogic();
            } else {
                FI<String> stringFI2 = () -> {
                    String newText;
                    newText = (String) parameter;
                    System.out.println(newText);
                };
                stringFI2.getLogic();
            }
        }
    }
}
