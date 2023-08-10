package org.example.Control;

import org.example.View.Menu;

import static org.example.View.Menu.*;
import static org.example.View.GetAnswer.*;

public class RunApp {
    static String notPoint = "Такого пункта в меню нет, попробуйте ещё раз";

    public static void run() {
        while (true) {
            int choice = choiceInMenu();
            mainMenu(choice);
            switch (choice) {
                case 1 -> {
                    System.out.println("Ищем созданные квартиры...");
                }
                case 2 -> {
                    System.out.println("Создаем новую квартиру...");
                }
                case 3 -> {
                    System.out.println("Инициализирую изменение тарифов...");
                }
                case 4 -> {
                    System.out.println("Спасибо за использование программы...");
                }
            }
        }
    }
}
