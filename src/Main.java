import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        int firstNumber;
        int secondNumber;
        String startMessage = "Выберите действие:"
                + "\n" + "1. Сложение;"
                + "\n" + "2. Вычитание;"
                + "\n" + "3. Умножение;"
                + "\n" + "4. Деление;"
                + "\n" + "5. Синус;"
                + "\n" + "6. Косинус;"
                + "\n" + "7. Корень из числа;"
                + "\n" + "8. Возведение в степень;"
                + "\n" + "0. Выход;";

        while (running) {
            System.out.println(startMessage);
            int chosen = scanner.nextInt();

            switch (chosen) {
                case 0:
                    running = false;
                    break;

                case 1:
                    firstNumber = enterNumber();
                    secondNumber = enterNumber();
                    System.out.println(Calculator.sum(firstNumber, secondNumber));
                    break;

                case 2:
                    firstNumber = enterNumber();
                    secondNumber = enterNumber();
                    System.out.println(Calculator.subtract(firstNumber, secondNumber));
                    break;

                case 3:
                    firstNumber = enterNumber();
                    secondNumber = enterNumber();
                    System.out.println(Calculator.multiply(firstNumber, secondNumber));
                    break;

                case 4:
                    firstNumber = enterNumber();
                    secondNumber = enterNumber();
                    System.out.println(Calculator.divide(firstNumber, secondNumber));
                    break;

                case 5:
                    firstNumber = enterNumber();
                    System.out.println(Calculator.sin(firstNumber));
                    break;

                case 6:
                    firstNumber = enterNumber();
                    System.out.println(Calculator.cos(firstNumber));
                    break;

                case 7:
                    firstNumber = enterNumber();
                    System.out.println(Calculator.root(firstNumber));
                    break;

                case 8:
                    firstNumber = enterNumber();
                    secondNumber = enterScale();
                    System.out.println(Calculator.power(firstNumber, secondNumber));
                    break;

                default:
                    System.out.println("Нет такой операции");
                    break;
            }
        }
    }

    public static int enterNumber() {
        System.out.println("Введите число:");
        return scanner.nextInt();
    }

    public static int enterScale() {
        System.out.println("Введите степень:");
        return scanner.nextInt();
    }
}
