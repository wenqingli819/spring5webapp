package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/*
 * Created by babydeveloper on 9/18/20.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
