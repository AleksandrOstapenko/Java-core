public class LongestIncreasingSubarray {
    public static void main(String[] args) {

        int[] egor = {5, 6, 2, 3, 4, 8, 1, 2};
        int[] downArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int currentLength = 1;
        int maxEgor = 1;
        int maxDownArray = 1;

        for (int i = 1; i < egor.length; i++) {
            if (egor[i] > egor[i - 1]) {
                currentLength++;
            } else currentLength = 1;
            if (currentLength > maxEgor){
                maxEgor = currentLength;
            }
        }
System.out.println("Максимальная длина egor : " + maxEgor);

        currentLength = 1;


        for (int i = 1; i < downArray.length; i++) {
            if (downArray[i-1] > downArray[i]) {
                currentLength++;
            } else currentLength = 1;
            if (currentLength >  maxDownArray) {
                maxDownArray = currentLength;
            }
        }
        System.out.println("Максимальная длина downArray : " + maxDownArray);

    }

}


