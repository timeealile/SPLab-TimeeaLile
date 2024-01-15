package ro.uvt.info.designpatternslab2023.classes;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Book extends Section implements Visitee {
    private List<Author> authorList;
    public Book(String title) {
        super(title);
        authorList = new ArrayList<>();
    }

    public Book(Book other){
        super(other.title);
        this.authorList = new ArrayList<>(other.authorList);
    }

    public void addAuthor(Author author) {
        this.authorList.add(new Author(author));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

}