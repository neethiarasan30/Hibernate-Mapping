package MAPPING.mapping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.AadharDetails;
import MAPPING.mapping.ENTITY.Student;
import MAPPING.mapping.Repository.StudentRepository;

@SpringBootTest
public class OneToOneUniDirectionalMapping {

	@Autowired	
	StudentRepository studentRepository;
	
//	@Test
//	public void saveStudent()
//	{
//		Student student = new Student();
//		student.setName("Neethi");
//		student.setLocation("Karur");
//		
//		AadharDetails aadharDetails = new AadharDetails();
//		aadharDetails.setAadharNumber(111);
//		
//		student.setAadharDetails(aadharDetails);
//		
//		studentRepository.save(student);		
//	}
	
	
//	@Test
//	public void saveStudents()
//	{
//		Student student1 = new Student();
//		student1.setName("Jayanth");
//		student1.setLocation("dindugul");
//		
//		AadharDetails aadharDetails1 = new AadharDetails();
//		aadharDetails1.setAadharNumber(112);
//		student1.setAadharDetails(aadharDetails1);
//		
//		
//		Student student2 = new Student();
//		student2.setName("Hari");
//		student2.setLocation("Madurai");
//		
//		AadharDetails aadharDetails2 = new AadharDetails();
//		aadharDetails2.setAadharNumber(113);
//		
//		student2.setAadharDetails(aadharDetails2);
//		
//		studentRepository.saveAll(List.of(student1,student2));		
//	}
	
//	@Test
//	public void update()
//	{
//		Student student = studentRepository.findById(2).get();
//		
//		student.setLocation("Chennai");
//		student.getAadharDetails().setAadharNumber(114);
//		
//		studentRepository.save(student);
//	}
	
//	
//	@Test
//	public void delete()
//	{
//		Student student = studentRepository.findById(2).get();	
//		studentRepository.delete(student);
//	}

}
