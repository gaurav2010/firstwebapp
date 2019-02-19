package co.gaurav.firstwebapp.bootstrap;

import co.gaurav.firstwebapp.model.Author;
import co.gaurav.firstwebapp.model.Book;
import co.gaurav.firstwebapp.model.Publisher;
import co.gaurav.firstwebapp.repository.AuthorRepository;
import co.gaurav.firstwebapp.repository.BookRepository;
import co.gaurav.firstwebapp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: sharm
 * Date: 14/02/19
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){
        Author eric = new Author("Eric", "Evans");
        Publisher pub1 = new Publisher("name", "pub1");
        Book aa  = new Book("Domain", "123", pub1);
        eric.getBooks().add(aa);
        aa.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(pub1);
        bookRepository.save(aa);

        Author rod = new Author("Rod", "AA");
        Publisher pub2 = new Publisher("nam", "add2");
        Book b = new Book("J2ee", "12345", pub2);
        rod.getBooks().add(b);

        authorRepository.save(rod);
        publisherRepository.save(pub2);
        bookRepository.save(b);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
