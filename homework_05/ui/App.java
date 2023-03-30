package OOP.homework_05.ui;

import OOP.homework_05.Config;
import OOP.homework_05.core.presenter.Presenter;

import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n\t1 - см. пред. запись\n" +
                        "\t2 - см. след. запись\n" +
                        "\t3 - добавить запись\n" +
                        "\t4 - удалить запись\n" +
                        "\t5 - сохранить запись в блокнот\n");
                System.out.print("Укажите номер меню >>> ");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1" -> presenter.prev();
                    case "2" -> presenter.next();
                    case "3" -> presenter.add();
                    case "4" -> presenter.remove();
                    case "5" -> presenter.saveToFile();
                    default -> System.out.println("Такой команды нет");
                }
            }
        }

    }
}
