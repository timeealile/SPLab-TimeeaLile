package ro.uvt.info.designpatternslab2023.persistence;

import ro.uvt.info.designpatternslab2023.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {


}