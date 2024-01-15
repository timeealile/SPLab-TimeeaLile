package ro.uvt.info.designpatternslab2023.classes;

import javax.swing.plaf.PanelUI;
import lombok.Getter;

public class Author implements Visitee {

    @Getter
    private String name;
    private String surname;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(Author author){
        this.name = author.name;
        this.surname = author.surname;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAuthor(this);
    }
}