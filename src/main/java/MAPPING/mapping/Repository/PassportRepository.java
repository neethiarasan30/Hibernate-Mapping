package MAPPING.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MAPPING.mapping.ENTITY.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer>{

}
