import presenter.Presenter;
import ui.ConsoleUI;
import ui.View;
import weatherApi.Repository;
import weatherApi.WeatherRepository;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        Repository repository = new WeatherRepository();
        Presenter presenter = new Presenter(view, repository);
        view.start();
    }
}
