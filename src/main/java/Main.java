import presenter.Presenter;
import ui.ConsoleUI;
import ui.DesktopUI;
import ui.View;
import weatherApi.Service;
import weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        Service service = new WeatherService();
        Presenter presenter = new Presenter(view, service);

        view.start();
    }
}
