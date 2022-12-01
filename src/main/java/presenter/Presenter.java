package presenter;

import ui.View;
import weatherApi.Repository;

public class Presenter {
    private View view;
    private Repository repository;

    public Presenter(View view, Repository repository) {
        this.view = view;
        this.repository = repository;
        view.setPresenter(this);
    }

    public void onClick(String city){
        String answer = repository.get(city);
        view.print(answer);
    }
}
