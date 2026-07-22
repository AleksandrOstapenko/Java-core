public class LearningDigits {

    public static void main(String[] args)  {

        int a = 283;  //Переменная/ целое число 32 бита. от -2^31 до (2^31)-1
        System.out.println(a);
        System.out.println(a + 5);
        System.out.println(a);
        a = a + 65;
        System.out.println(a);

        long l = 423_423_123_123L;  //Переменная/ целое число 64 бита. от -2^63 до (2^63)-1
        System.out.println(l);
        System.out.println(a + l);

        short s = 2323; //Переменная/ целое число 16 бит. от -2^15 до (2^15)-1
        System.out.println(s);

        byte b = 127;  //Переменная/ целое число 8 бит. от -2^7 до (2^7)-1, от -128 до 127
        System.out.println(b);

        System.out.println(Math.pow(2, 63));

        ///////////////////////


        double d = 3.14; //64 бита
        System.out.println(d + s);
        System.out.println();

        float f = 3.14F; //32 бита

        char c = 'A';
        System.out.println(c);
        System.out.println(c + 2);
        char c2 = 65;
        System.out.println(c2);

    }
}
