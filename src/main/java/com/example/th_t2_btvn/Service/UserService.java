package com.example.th_t2_btvn.Service;

import com.example.th_t2_btvn.Repositories.IUserRepository;
import com.example.th_t2_btvn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public  void save(User user){
        userRepository.save(user);
    }
}
