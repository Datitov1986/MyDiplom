package org.example.View;

public class Menu {
    public static void mainMenu(int values) {
        System.out.println("В моей программе вы можете вносить или считывать ранее внесенные показания" +
                "различных счетчиков ЖКХ");
        System.out.println("1. Выбрать квартиру из списка");
        System.out.println("2. Создать новую квартиру");
        System.out.println("3. Изменить тарифы");
        System.out.println("0. Уйти\n");
    }

    public static void appartmentMenu(int values) {
        System.out.println("Выберите действия, которые хотите совершить: ");
        System.out.println("1. Внести показание");
        System.out.println("2. Посмотреть ранее внесенные показания");
        System.out.println("3. Вернуться в предыдущее меню");
        System.out.println("0. Уйти\n");
    }

    public static void writeCounters(int values) {
        System.out.println("Выберите показания каких счетчиков вы хотите ввести: ");
        System.out.println("1. Счетчики воды");
        System.out.println("2. Счетчики электроэнергии");
        System.out.println("3. Вернуться в предыдущее меню");
        System.out.println("0. Уйти\n");
    }

    public static void readCounters(int values) {
        System.out.println("Выберите показания каких счетчиков вы хотите посмотреть: ");
        System.out.println("1. Счетчики воды");
        System.out.println("2. Счетчики электроэнергии");
        System.out.println("3. Все введенные показания счетчиков");
        System.out.println("3. Вернуться в предыдущее меню");
        System.out.println("0. Уйти\n");
    }

    public static void tarifChange(int values) {
        System.out.println("Выберите какой тариф вы хотите изменить: ");
        System.out.println("1. Тариф холодной воды");
        System.out.println("2. Тариф горячей воды");
        System.out.println("3. Тариф водоотведения воды");
        System.out.println("4. Тариф электроэнергии Т1");
        System.out.println("5. Тариф электроэнергии Т2");
    }
}
