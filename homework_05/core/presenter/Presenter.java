package OOP.homework_05.core.presenter;

import OOP.homework_05.core.model.Note;
import OOP.homework_05.core.model.Model;
import OOP.homework_05.ui.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().size() > 0) {
            model.setCurrentIndex(0);
            var entry = model.currentNote();

            view.setDescription(entry.description);
        }
    }

    public void add() {
        model.currentBook().add(
                new Note(view.getDescription()));
    }

    public void remove() {
        model.currentBook().remove(
                new Note(view.getDescription()));

        if (model.currentBook().size() < 1) {
            model.setCurrentIndex(-1);
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Note temp = model.currentNote();
            view.setDescription(temp.description);
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().size() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().size()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Note note = model.currentNote();
                view.setDescription(note.description);
            } else System.out.println("пусто");
        }
    }
    public void prev() {
        if (model.currentBook().size() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Note note = model.currentNote();
                view.setDescription(note.description);
            } else System.out.println("пусто");
        }
    }
}
