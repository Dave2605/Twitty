package core.data;

import core.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dave on 09.05.17.
 */
//public interface AuthorRepository {
//   // @Cacheable
//    Author findByUsername(String username) throws DataNotFoundException;
//    //@CachePut(key="#result.id")
//    @Secured("ROLE_ADMIN")
//    void save(Author author);
//}
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    Author findByUsername(String username);
}