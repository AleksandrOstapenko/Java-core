public class LearningWhile {


    public static void main(String[] args) {

        int a = 0;// Создаётся переменная 'a' целого типа со значением 0.

        while (a < 3) { // Цикл выполняется, пока 'a' меньше 3.
            System.out.println(a);// Выводит текущее значение 'a'.
            //a = a + 1;  // Это комментарий. Обычное увеличение переменной на 1. Программа его игнорирует.
            //System.out.println(++a) на следующий разок
            //унарная операция - изменение на один
            System.out.println(++a); // Префиксный инкремент. Сначала увеличивает 'a' на 1, потом выводит её.
            System.out.println(a); // Выводит уже изменённое значение 'a'.

        }

        //boolean condition2 = a > 3;

        int counter = -3; // Переменная-счетчик со значением -3.
        boolean condition = true; // Логическая переменная (флаг) со значением true.
        while (condition) { // Цикл работает, пока condition равен true.
            System.out.println("hello"); // Выводит текст "hello".
            counter++; // Постфиксный инкремент. Увеличивает counter на 1.
            condition = counter < 0; // Проверяет, меньше ли counter нуля, и обновляет condition.



}

    }



}
