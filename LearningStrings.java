public class LearningStrings {

    public static void main(String[] args) {

        String s = "Hello"; // Строка String s = — это начало создания переменной для хранения текста. Java ищет "Hello" в специальной памяти (String Pool). Если её там нет, создает.
        System.out.println(s); // Выведет: Hello
        String s2 = new String("Hello"); // Ключевое слово 'new' ПРИНУДИТЕЛЬНО создаёт абсолютно новый объект в памяти (в куче/heap), игнорируя String Pool.
        System.out.println(s2); // Выведет: Hello
        System.out.println(s == s2); // ВНИМАНИЕ: Выведет 'false'!
// Оператор '==' для объектов сравнивает не буквы внутри, а ссылки в памяти (адреса). Поскольку 's' и 's2' лежат в разных местах памяти, они не равны.
        System.out.println(s.equals(s2)); // Выведет 'true'!
// Метод '.equals()' сравнивает именно внутреннее содержимое строк (буква за буквой). "Hello" совпадает с "Hello".
        System.out.println("people".equals("shit")); // Выведет 'false'. Текст внутри разный
        System.out.println("people".equals(s)); // Выведет 'false'. "people" не равно "Hello".

        System.out.print("a");  // Печатает "a", курсор остается тут же.
        System.out.println("b"); // Печатает "b" сразу за "a" (получилось "ab") и переносит курсор на новую строку.
        System.out.print("c"); // На новой строке печатает "c", курсор остается.
        System.out.println("b"); // Печатает "b" сразу за "c" (получилось "cb") и переносит курсор.
        System.out.println(); // Печатает "пустоту" и просто переносит курсор на новую строку (делает пустой отступ).
        System.out.print("\n"); // Напечатает пустую строку (перенос курсора вниз).
        System.out.print("\tasd\n"); // '\t' сделает отступ, затем напечатает "asd", а '\n' перенесет курсор на строку ниже.


        System.out.printf("%s %s %s", "My", "name", "is");
        // Первый %s заменяется на "My"
        // Второй %s заменяется на "name"
        // Третий %s заменяется на "is"
        // Выведет на экран: My name is


    }


}