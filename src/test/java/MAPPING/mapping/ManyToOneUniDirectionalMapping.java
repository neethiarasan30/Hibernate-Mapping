package MAPPING.mapping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.Department;
import MAPPING.mapping.ENTITY.Employee;
import MAPPING.mapping.Repository.DepartmentRepository;
import MAPPING.mapping.Repository.EmployeeRepository;

@SpringBootTest
public class ManyToOneUniDirectionalMapping {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	  
	@Test
	public void saveEmployee()
	{
		Department department1 = new Department();
		department1.setName("JAVA");
		
		departmentRepository.save(department1);
		
		Employee employee1 = new Employee();
		employee1.setName("Neethi");
		employee1.setDepartment(department1);
		
		
		Employee employee2 = new Employee();
		employee2.setName("Mani");
		employee2.setDepartment(department1);
		
		
		
		employeeRepository.saveAll(List.of(employee1,employee2));
	}
}
