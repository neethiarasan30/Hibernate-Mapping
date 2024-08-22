package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
