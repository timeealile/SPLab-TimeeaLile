package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.Entity.Book;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command {

    private final Long id;
    private final Book book; //copie
    Book result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().save(book);
    }

    public Book getResults() {
        return result;
    }
}