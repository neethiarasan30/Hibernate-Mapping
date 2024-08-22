package MAPPING.mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.College;
import MAPPING.mapping.ENTITY.Faculty;
import MAPPING.mapping.Repository.CollegeRepository;

@SpringBootTest
public class OneToManyUniDirectionalMapping {
 
	@Autowired 
	CollegeRepository collegeRepository;
	
	@Test 
	public void saveCollege()
	{
		College college = new College();
		
		college.setCollegeName("Anna University");
		
		Faculty faculty1 = new Faculty();	
		faculty1.setName("Vetri");
		
		Faculty faculty2 = new Faculty();
		faculty2.setName("Ramesh");
		
		college.getFaculty().add(faculty1);
		college.getFaculty().add(faculty2);
		
		collegeRepository.save(college);
	}
}
