import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
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
                    int firstSumNumber = enterNumber();
                    int secondSumNumber = enterNumber();
                    System.out.println(Calculator.sum(firstSumNumber, secondSumNumber));
                    break;

                case 2:
                    int firstDifNumber = enterNumber();
                    int secondDifNumber = enterNumber();
                    System.out.println(Calculator.subtract(firstDifNumber, secondDifNumber));
                    break;

                case 3:
                    int firstMultiNumber = enterNumber();
                    int secondMultiNumber = enterNumber();
                    System.out.println(Calculator.multiply(firstMultiNumber, secondMultiNumber));
                    break;

                case 4:
                    int firstDivNumber = enterNumber();
                    int secondDivNumber = enterNumber();
                    System.out.println(Calculator.divide(firstDivNumber, secondDivNumber));
                    break;

                case 5:
                    int sinNumber = enterNumber();
                    System.out.println(Calculator.sin(sinNumber));
                    break;

                case 6:
                    int cosNumber = enterNumber();
                    System.out.println(Calculator.cos(cosNumber));
                    break;

                case 7:
                    int rootNumber = enterNumber();
                    System.out.println(Calculator.root(rootNumber));
                    break;

                case 8:
                    int powerNumber = enterNumber();
                    int powerScale = enterScale();
                    System.out.println(Calculator.power(powerNumber, powerScale));
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
