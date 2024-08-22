package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{

}
