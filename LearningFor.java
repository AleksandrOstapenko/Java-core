public class LearningFor {

    public static void main(String[] args) {


        int[] digits = {5, 3, 8, 9, 11};

        for (int i = 0; i< digits.length; i++ ) {
            System.out.println(digits[i] + " : index - " + (i));
        }

        for (int i = digits.length -1; i >= 0; i-- ) {
            System.out.println(digits[i] + " : index - " + (i));
        }

        int sum = 0;
        for (int a : digits) {  //for each
            sum += a;
        }
        System.out.println(sum);
    }

}
