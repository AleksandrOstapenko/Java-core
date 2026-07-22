import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 1000;
        String lasttransaction = "Операций еще не было";
        int pin = 2121;
        Scanner sc = new Scanner(System.in);

        boolean sessionActive = true;
        while (sessionActive) {
            System.out.println("Добро пожаловать в банкомат!\nПожалуйста, введите PIN");
            int enteredpin = sc.nextInt();

            if (enteredpin != pin) {
                System.out.println("Доступ запрещен. Неверный ПИН");
                continue;

            }
            while (sessionActive) {
                System.out.println("1. Снять наличные");
                System.out.println("2. Внести наличные");
                System.out.println("3. Проверить баланс");
                System.out.println("4. Посмотреть последнюю операцию");
                System.out.println("5. Выход");
                System.out.print("Введите ваш выбор:   ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        // Снятие
                        System.out.print("Введите сумму для снятия: ");
                        int withdraw = sc.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance = balance - withdraw;
                            //balance -= withdraw;
                            lasttransaction = "Вы сняли: " + withdraw + " руб.";
                            System.out.println("Снятие успешно! Пожалуйста, возьмите ваши наличные.\n");
                        } else if (withdraw > balance) {
                            System.out.println("А ты не охуел? Недостаточно средств! Пожалуйста, попробуйте меньшую сумму.\n");
                        } else {
                            System.out.println("Че это за хуйня вообще? Неверная сумма. Пожалуйста, попробуйте еще раз.\n");
                        }
                        break;
                    case 2:
                        //Внести наличные
                        System.out.println("Введите сумму для внесения на счёт: ");
                        int deposit = sc.nextInt();
                        if (deposit > 0) {
                            balance = balance + deposit;
                            //balance += deposit;
                            lasttransaction = "Вы пополнили: " + deposit + " руб.";
                            System.out.println("Средства успешно внесены! Спасибо.");
                        } else {
                            System.out.println("Че это за хуйня вообще? Неверная сумма. Пожалуйста, попробуйте еще раз.\n");
                        }
                        break;
                    case 3:
                        //Проверить баланс
                        System.out.println("Ваш текущий баланс: " + balance + " руб.\n");
                        break;
                    case 4:
                        //Посмотреть последнюю операцию
                        System.out.println("Последняя операция: " + lasttransaction + "\n");
                        break;
                    case 5:
                        //Выход
                        System.out.println("Спасибо,что воспользовались банкоматом. Хорошего дня!\n");
                        sessionActive = false;
                        break;
                    default: System.out.println("Неверный пункт меню!");
                }


            }

        }

    }

}



