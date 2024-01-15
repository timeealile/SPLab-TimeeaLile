package ro.uvt.info.designpatternslab2023.services;

import lombok.RequiredArgsConstructor;
import ro.uvt.info.designpatternslab2023.Entity.Book;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;

    public void execute(CommandContext context) {
        context.getBookRepository().deleteById(id);
    }
}