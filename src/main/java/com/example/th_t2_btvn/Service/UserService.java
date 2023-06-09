package com.example.th_t2_btvn.Service;

import com.example.th_t2_btvn.Repositories.IRoleRepository;
import com.example.th_t2_btvn.Repositories.IUserRepository;
import com.example.th_t2_btvn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;
    public  void save(User user){
        userRepository.save(user);

        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if (roleId != 0 && userId != 0) {
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
