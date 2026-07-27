import java.util.Scanner;

public class RomanConverter {
    public static void main(String[] args) {

        System.out.println("Введите число от 1 до 3999:");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        if (numbers > 3999 || numbers < 1) {
            System.out.println("Ошибка! Напишите верное число!");
        } else {
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            String result = "";
            for (int i = 0; i < values.length; i++) {
                while (numbers >= values[i]) {
                    numbers = numbers - values[i];
                    result = result + romanLetters[i];
                }
            }

            System.out.println(result);
        }

    }
}

