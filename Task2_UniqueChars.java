
import java.util.Scanner;

public class Task2_UniqueChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Напишите что-нибудь!");
        String text = sc.nextLine().toLowerCase();

        String unique = "";

        char[] chars = text.toCharArray();

        for (char c : chars) {
            String symb = "" + c;
            if (!unique.contains(symb) && c != ' ') {
                unique += c;
            }
        }

        System.out.println(unique);
        System.out.println("количество уникальных символов: " + unique.length());
    }
}


