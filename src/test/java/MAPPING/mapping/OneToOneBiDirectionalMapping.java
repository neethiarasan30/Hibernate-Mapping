package MAPPING.mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.Passport;
import MAPPING.mapping.ENTITY.Person;
import MAPPING.mapping.Repository.PassportRepository;
import MAPPING.mapping.Repository.PersonRepository;

@SpringBootTest
public class OneToOneBiDirectionalMapping {

	@Autowired
	PassportRepository passportRepository;
	
	@Autowired
	PersonRepository personRepository;
//	
//	@Test
//	public void savePassport()
//	{
//		Passport passport = new Passport();
//		
//		passport.setPassportNumber("111");
//		
//		Person person = new Person();
//		person.setName("Neethi");
//		person.setPassport(passport);
//		
//		passport.setPerson(person);	
//		
//		passportRepository.save(passport);
//	}
//	
//	@Test
//	public void getPassportDetails()
//	{
//		Passport passport = passportRepository.findById(1).get();
//		
//		System.out.println(passport.getPassportNumber());
//		System.out.println(passport.getPerson().getName());
//
//	}
	
	
//	@Test
//	public void UpdatePassportDetails()
//	{
//		Passport passport = passportRepository.findById(2).get();
//		
//		passport.setPassportNumber("112");
//		passport.getPerson().setName("Guhan");
//		
//		passportRepository.save(passport);
//	}
	
	
//	@Test
//	public void DeletePassportDetails()
//	{
//		Passport passport = passportRepository.findById(1).get();
//		
//		passportRepository.delete(passport);
//	}
	
	

}
