package OOP.homework_05.ui;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleView implements View{
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getDescription() {
        System.out.print("Описание записи: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String description) {
        System.out.printf("Описание: %s\n", description);
    }
}
