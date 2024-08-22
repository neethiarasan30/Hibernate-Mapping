package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer>{

}
