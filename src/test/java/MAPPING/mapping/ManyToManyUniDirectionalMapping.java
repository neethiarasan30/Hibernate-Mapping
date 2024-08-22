package MAPPING.mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MAPPING.mapping.ENTITY.Roles;
import MAPPING.mapping.ENTITY.Users;
import MAPPING.mapping.Repository.UserRepository;

@SpringBootTest
public class ManyToManyUniDirectionalMapping {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void saveUser()
	{
		 Users user1 = new Users();
		 
		 user1.setName("Neethi");
		 
		 Roles role1 = new Roles();
		 
		 role1.setRoleName("TL");
		 
		 
		 Roles role2 = new Roles();
		 
		 role2.setRoleName("Developer");
		 
		 user1.getRoles().add(role1);
		 user1.getRoles().add(role2);

		 userRepository.save(user1);
	}
}
