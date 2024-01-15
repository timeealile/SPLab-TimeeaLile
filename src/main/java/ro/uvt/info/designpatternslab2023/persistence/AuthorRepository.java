package ro.uvt.info.designpatternslab2023.persistence;

import ro.uvt.info.designpatternslab2023.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
