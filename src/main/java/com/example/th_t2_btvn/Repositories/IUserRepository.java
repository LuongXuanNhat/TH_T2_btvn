package com.example.th_t2_btvn.Repositories;

import com.example.th_t2_btvn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  IUserRepository  extends JpaRepository<User, Long> {
    @Query("SELECT u from User u where u.username = ?1")
    User findByUsername(String username);
}
