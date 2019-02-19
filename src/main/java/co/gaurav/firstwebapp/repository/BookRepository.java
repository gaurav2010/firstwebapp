package co.gaurav.firstwebapp.repository;

import co.gaurav.firstwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: sharm
 * Date: 14/02/19
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
