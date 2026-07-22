import java.util.Scanner;

public class Task1_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Привет! напиши чего-нибудь");
        System.out.println("Привет! Это тест");
        System.out.println("Привет! Это тест");

        String text = sc.nextLine();

        int digitCount = 0;
        int letterCount = 0;
        int[] charCounts = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            charCounts[ch]++;

            if (Character.isDigit(ch)) {
                digitCount++;

            } else if (Character.isLetter(ch)) {
                letterCount++;
            }

        }

        System.out.println("Введенных букв: " + letterCount);
        System.out.println("Введенных цифр: " + digitCount);
        System.out.println("Статистика по каждому символу:");
        for (int j = 0; j < 256; j++) {
            if (charCounts[j] > 0) {
                System.out.println("Символ '" + (char) j + "'встретился: '" + charCounts[j] + "раз(а)");

            }

        }

    }

}




