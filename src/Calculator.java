public class Calculator {
    public static int sum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return (firstNumber - secondNumber);
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }

    public static double divide(int firstNumber, int secondNumber) {
        return ((double) firstNumber / secondNumber);
    }

    public static double sin(int number) {
        return Math.sin(number);
    }

    public static double cos(int number) {
        return Math.cos(number);
    }

    public static double root(int number) {
        if (number == 0) {
            return 0;
        }
        int left = 1;
        int right = number / 2 + 1;
        double res = 0;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (mid <= number / mid) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static int power(int number, int scale) {
        int result = 1;
        for (int i = 0; i < scale; i++) {
            result *= number;
        }
        return result;
    }
}
