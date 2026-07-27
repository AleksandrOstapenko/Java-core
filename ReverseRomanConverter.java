public class ReverseRomanConverter {
    public static void main(String[] args) {

        String roman = "XIV";

        int totalSum = 0;
        int i = 0;


        while (i < roman.length() - 1) {


            char currentLetter = roman.charAt(i);
            char nextLetter = roman.charAt(i + 1);

            int currentValue = 0;
            if (currentLetter == 'I') {
                currentValue = 1;
            } else if (currentLetter == 'V') {
                currentValue = 5;
            } else if (currentLetter == 'X') {
                currentValue = 10;
            }


            int nextValue = 0;
            if (nextLetter == 'I') {
                nextValue = 1;
            } else if (nextLetter == 'V') {
                nextValue = 5;
            } else if (nextLetter == 'X') {
                nextValue = 10;
            }


            if (currentValue >= nextValue) {
                totalSum += currentValue;
            } else {
                totalSum -= currentValue;
            }

            i++;
        }


        char lastLetter = roman.charAt(roman.length() - 1);
        int lastValue = 0;


        if (lastLetter == 'I') {
            lastValue = 1;
        } else if (lastLetter == 'V') {
            lastValue = 5;
        } else if (lastLetter == 'X') {
            lastValue = 10;
        }

        totalSum += lastValue;


        System.out.println("Римское число " + roman + " = " + totalSum);
    }
}