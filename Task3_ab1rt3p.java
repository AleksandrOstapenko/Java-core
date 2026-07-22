import java.util.Scanner;

public class Task3_ab1rt3p {

    public static void main (String [] args) {

        String text = "ab1rt3p";

        char[] chars = text.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (!Character.isLetter(chars[left])) {
                left++;

            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;

            }
        }

        System.out.println(new String(chars));


    }

}
