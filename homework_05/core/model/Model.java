package OOP.homework_05.core.model;

import java.io.*;
import java.time.DateTimeException;

public class Model {
    Notebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Notebook();
        currentIndex = 0;
        this.path = path;
    }

    public Note currentNote() {
        if (currentIndex >= 0) {
            return currentBook.getNote(currentIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String description = reader.readLine();
            while (description != null) {
                this.currentBook.add(new Note(description));
                description = reader.readLine();
            }
            reader.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.size(); i++) {
                Note note = currentBook.getNote(i);
                writer.append(String.format("%s\n", note.description));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (DateTimeException e){
            e.printStackTrace();
        }
    }

    public Notebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}
