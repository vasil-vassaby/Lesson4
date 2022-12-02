import presenter.Presenter;
import ui.ConsoleUI;
import ui.View;
import weatherApi.Repository;
import weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        Repository repository = new WeatherService();
        Presenter presenter = new Presenter(view, repository);
        view.start();
    }
}
