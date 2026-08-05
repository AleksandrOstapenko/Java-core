public class Solution {

    public static int lengthOfLastWord(String s){

        int i = s.length() - 1;


        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;


        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println("Число символов в последнем слове: " + lengthOfLastWord(s));


    }
}

//public class Solution {
//    public static void main(String[] args){
//
//        String s = "   fly me   to   the moon  ";
//        int i = s.length() - 1;
//
//        while (i >= 0 && s.charAt(i) == ' ') {
//            i--;
//        }
//            int length = 0;
//while (i >= 0 && s.charAt(i) != ' ' ){
//    length++;
//    i--;
//}
//System.out.println(length);
//    }
//}