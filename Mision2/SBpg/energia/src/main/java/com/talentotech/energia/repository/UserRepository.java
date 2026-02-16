package com.talentotech.energia.repository;
import org.springframework.stereotype.Repository;
import com.talentotech.energia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
