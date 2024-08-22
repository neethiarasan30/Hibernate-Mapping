package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
