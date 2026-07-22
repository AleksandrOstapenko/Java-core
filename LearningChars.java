import java.util.Arrays;

public class LearningChars {

    public static void main(String [] args) {
            String s = "Hello 11";

            System.out.println(s.toUpperCase()); // Преобразование строки в верхний регистр и вывод результата ("HELLO 11") в консоль.

            System.out.println(s); // Вывод исходной строки "Hello 11". Метод toUpperCase() не меняет саму переменную s.
            System.out.println(s.toLowerCase());  // Преобразование строки в нижний регистр и вывод результата ("hello 11") в консоль.

            System.out.println(s.isEmpty()); // Проверка, пустая ли строка. Выведет false, так как в строке есть символы.

            char[] chars = s.toCharArray(); // Преобразование строки s в массив символов char[] и запись его в переменную chars.
            System.out.println(Arrays.toString(chars)); // Преобразование массива символов в красивую строку вида [H, e, l, l, o,  , 1, 1] и вывод в консоль.
            for (char c : chars) {  // Цикл for-each, который поочередно перебирает каждый символ c из массива chars.
                System.out.println(c + " : " + Character.isAlphabetic(c)); // Вывод текущего символа и проверка, является ли он буквой (true/false). Пробел и цифры дадут false.


            }



    }

}
