public class Bubbles {

    public static void main(String[] args) {

        int[] digits = {5, 1, 7, 4, 2, 0, 8, -3};
        int n = digits.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (digits[j] > digits[j + 1]) {
                    int temp = digits[j];

                digits[j] = digits[j + 1];
                digits[j + 1] = temp;

            }
        }
    }


for (int i : digits) {
        System.out.print(i + " ");




        }


    }


}

