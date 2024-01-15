package ro.uvt.info.designpatternslab2023.services;

import lombok.RequiredArgsConstructor;
import ro.uvt.info.designpatternslab2023.Entity.Book;

import java.util.Map;

@RequiredArgsConstructor
public class CommandAddBook implements Command {

    Book result;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        //result = context.getBookRepository().save(new Book((String) request.get("Titlu")));
        Book carte = new Book();
        result = context.getBookRepository().save(carte);
    }

    public Book getResults() {
        return result;
    }
}