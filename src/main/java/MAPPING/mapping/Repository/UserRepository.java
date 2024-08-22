package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer>{

	
}
