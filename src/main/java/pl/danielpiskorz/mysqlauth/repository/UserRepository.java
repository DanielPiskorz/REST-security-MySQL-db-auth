package pl.danielpiskorz.mysqlauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.danielpiskorz.mysqlauth.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
