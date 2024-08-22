package MAPPING.mapping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.Author;
import MAPPING.mapping.ENTITY.Book;
import MAPPING.mapping.Repository.AuthorRepository;
import MAPPING.mapping.Repository.BookRepository;

@SpringBootTest
public class ManyToOneBiDirectionalMapping {
 
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
//	@Test
//	public void saveBook()
//	{
//		Author author = new Author();
//		author.setAuthorName("shakespeare");
//		
//		
//		Book book1 = new Book();
//		book1.setBookName("The seven ages of man");
//		book1.setAuthor(author);
//		
//		Book book2 = new Book();
//		book2.setBookName("No Fear");
//		book2.setAuthor(author);
//
//		
//		Book book3 = new Book();
//		book3.setBookName("The Family");
//		book3.setAuthor(author);
//
//		author.getBooks().add(book1);
//		author.getBooks().add(book2);
//		author.getBooks().add(book3);
//		
//		bookRepository.saveAll(List.of(book1,book2,book3));
//
//	}
	
	
	
//	@Test
//	public void saveAuthor()
//	{
//		Author author = authorRepository.findById(1).get();
//		
//		Book book = new Book();
//		book.setBookName("sonnet40");
//		book.setAuthor(author);
//		
//		author.getBooks().add(book);
//		
//		authorRepository.save(author);
//		
//	}
	
	
//	@Test
//	public void findByAuthor()
//	{
//		Book book = bookRepository.findById(1).get();
//		
//		System.out.println(book.getAuthor().getAuthorName());
//	}
	
	
	
}
