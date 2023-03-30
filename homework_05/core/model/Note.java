package OOP.homework_05.core.model;

/**
 * Класс Запись в блокнот
 */
public class Note {
    public String description;

    /**
     * Конструктор для записи в блокнот
     * @param description описание
     */
    public Note(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(Object obj) {
        Note n = (Note) obj;
        return this.description == n.description;
    }
}
