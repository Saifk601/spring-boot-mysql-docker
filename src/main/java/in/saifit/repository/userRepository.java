package in.saifit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.saifit.entity.user;

//@Repository
public interface userRepository extends JpaRepository<user , Integer>{
	
	 

}
