import java.util.Scanner;
public class LetterScore {
    public static int getLetterScore(char letter) {

        int value = 0;

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'S':
            case 'T':
            case 'R':
                value = 1;
                break;
            case 'D':
            case 'G':
                value = 2;
                break;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                value = 3;
                break;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                value = 4;
                break;
            case 'K':
                value = 5;
                break;
            case 'J':
            case 'X':
                value = 8;
                break;
            case 'Q':
            case 'Z':
                value = 10;
                break;
            default:
                value = -1;
                break;
        }
        return value;

    }

    public static int getWordScore(String word) {
        int totalSum = 0;

        for (int i = 0; i < word.length(); i++) {

            char currentLetter = word.charAt(i);
            int currentValue = getLetterScore(currentLetter);

            if (currentValue == -1) {
                System.out.println("Ошибка! Недопустимый символ!");
                return -1;
            } else {
                totalSum += currentValue;
            }
        }
        return totalSum;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько человек будет играть?");
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[playerCount];
        int[] scores = new int[playerCount];
        int maxScore = 0;

        // Вводим слова, считаем очки и находим рекорд (maxScore)
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Введите слово игрока " + (i + 1) + ":");
            words[i] = scanner.nextLine().toUpperCase();
            scores[i] = getWordScore(words[i]);

            System.out.println("Игрок " + (i + 1) + " слово " + words[i] + " стоит " + scores[i] + " очков.");

            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // Только считаем, сколько человек набрали рекорд maxScore
        int winnersCount = 0;
        for (int i = 0; i < playerCount; i++) {
            if (scores[i] == maxScore) {
                winnersCount++;
            }
        }

        // Объявляем результаты
        System.out.println("-------------------------");
        if (winnersCount >= 2) {
            System.out.println("Ничья! Рекордный балл (" + maxScore + ") набрали следующие игроки:");
        } else {
            System.out.println("Безоговорочная победа! Чемпион:");
        }

        // Выводим имена тех, кто набрал рекорд
        for (int i = 0; i < playerCount; i++) {
            if (scores[i] == maxScore) {
                System.out.println("Игрок " + (i + 1) + " со словом " + words[i]);
            }
        }
    }

}

