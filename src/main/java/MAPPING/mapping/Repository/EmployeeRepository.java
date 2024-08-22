package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
