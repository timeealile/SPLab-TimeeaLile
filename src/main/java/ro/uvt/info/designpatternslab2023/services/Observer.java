package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.Entity.Book;

public interface Observer {
    void update(Book b);
}
