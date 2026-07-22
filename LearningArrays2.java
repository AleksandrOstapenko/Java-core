import java.util.Arrays;
import java.util.Scanner;

public class LearningArrays2 {


    public static void main(String[] args) {


        System.out.println("Введите количество элементов:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Элементы массива: ");
        System.out.println(Arrays.toString(array));

        int sum = 0;
        int max = array[0];
        int countMoreThanTen = 0;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            sum += current;

            if (current > max) {
                max = current;
            }

                if (current > 10) {
                    countMoreThanTen++;
                }
            }

            System.out.println("Сумма элементов: " + sum);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Количество элементов > 10: " + countMoreThanTen);


        }

    }


