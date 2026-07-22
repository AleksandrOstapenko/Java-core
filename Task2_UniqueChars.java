
import java.util.Scanner;

public class Task2_UniqueChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Напишите что-нибудь!");
        String text = sc.nextLine();


        String unique = "";

        char[] chars = text.toCharArray();

        for (char c : text.toCharArray()) {
            String symb = "" + c;
            if (!unique.contains(symb)) {
                unique += c;
            }
        }

        System.out.println(unique);
    }
}





//        int[] charCounts = new int[256];
//
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            charCounts[ch]++;
//        }
//        System.out.println("Вариант А (только уникальные без повторений):");
//
//        for (int j = 0; j< 256; j++){
//            if (charCounts[j] == 1) {
//                System.out.print((char)j+ "");
//
//            }
//        }
//        System.out.println();
//
//        System.out.println("Вариант Б (все символы строки без дубликатов):");
//
//        for(int j = 0; j<256; j++){
//            if (charCounts [j] >0) {
//                System.out.print((char)j+ "");
//            }
//        }
//
//
//    }
//
//
//    }


