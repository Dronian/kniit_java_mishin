import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static double add(double firstDigit, double secondDigit) {
        return firstDigit + secondDigit;
    }

    public static double subtract(double firstDigit, double secondDigit) {
        return firstDigit - secondDigit;
    }

    public static double multiply(double firstDigit, double secondDigit) {
        return firstDigit * secondDigit;
    }

    public static double divide(double firstDigit, double secondDigit) {
        if (secondDigit == 0) {
            throw new IllegalArgumentException("Ошибка: Деление на ноль невозможно.");
        }
        return firstDigit / secondDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                String firstInput = scanner.next();

                if (firstInput.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }

                double firstNumber = Double.parseDouble(firstInput);

                System.out.print("Введите оператор: ");
                String operator = scanner.next();

                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();

                switch (operator) {
                    case "+" -> System.out.println("Результат: " + add(firstNumber, secondNumber));
                    case "-" -> System.out.println("Результат: " + subtract(firstNumber, secondNumber));
                    case "*" -> System.out.println("Результат: " + multiply(firstNumber, secondNumber));
                    case "/" -> System.out.println("Результат: " + divide(firstNumber, secondNumber));
                    default -> System.out.println("Такой операции нет в калькуляторе.");
                }
                System.out.print("\n");
            }

            catch (NumberFormatException e) {
                System.out.println("Ошибка: Вы ввели некорректное число:" + e.getMessage().split(":")[1] + ".");
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: Вы ввели некорректное число.");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
