package com.linkdoan.backend.repository;

import com.linkdoan.backend.model.Employee;
import com.linkdoan.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component("beanName1")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
