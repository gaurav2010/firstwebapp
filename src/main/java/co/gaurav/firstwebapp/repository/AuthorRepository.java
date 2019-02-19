package co.gaurav.firstwebapp.repository;

import co.gaurav.firstwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: sharm
 * Date: 14/02/19
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
