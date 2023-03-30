package OOP.homework_05.core.model;

import java.util.ArrayList;
import java.util.List;


public class Notebook{
    private List<Note> notes;
    public Notebook(){
        notes = new ArrayList<>();
    }

    /**
     * Метод добавления записи
     * @param note новая запись
     * @return true, если запись добавлена в блокнот, иначе false
     */
    public boolean add(Note note) {
        boolean flag = false;
        if (!notes.contains(note)) {
            notes.add(note);
            flag = true;
        }
        return flag;
    }

    /**
     * Метод удаления записи
     * @param note удаляемая запись
     * @return true, если запись удалена из блокнота, иначе false
     */
    public boolean remove(Note note) {
        boolean flag = false;
        if (notes.contains(note)) {
            notes.remove(note);
            flag = true;
        }
        return flag;
    }

    /**
     * Метод чтения записи
     * @param index индекс просматриваемой записи
     * @return запись из блокнота по указанному индексу
     */
    public Note getNote(int index) {
        return notes.get(index);
    }

    /**
     * Метод изменения записи
     * @param index индекс изменяемой записи
     * @return измененная запись в блокноте по указанному индексу
     */
    public Note updateNote(int index, Note note) {
        return notes.set(index, note);
    }

    /**
     * Метод вывода всех записей
     * @return список записей в блокноте
     */
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * @return количество записей в блокноте
     */
    public int size() {
        return notes.size();
    }
}