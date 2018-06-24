package com.example.springjpamysql;

import com.example.springjpamysql.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository <Person, Long>{
	
	
}
