package ro.uvt.info.designpatternslab2023.services;
import org.springframework.stereotype.Component;
import ro.uvt.info.designpatternslab2023.Entity.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        observers.forEach(observer -> observer.update(book));
    }
}
