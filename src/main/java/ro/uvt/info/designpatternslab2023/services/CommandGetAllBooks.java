package ro.uvt.info.designpatternslab2023.services;
import lombok.RequiredArgsConstructor;
import ro.uvt.info.designpatternslab2023.Entity.Book;


import java.util.List;

@RequiredArgsConstructor
public class CommandGetAllBooks implements Command {
    List<Book> result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().findAll();
    }

    public List<Book> getResults() {
        return result;
    }
}