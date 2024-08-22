package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
