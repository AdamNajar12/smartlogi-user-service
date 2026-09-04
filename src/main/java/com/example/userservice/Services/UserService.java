package com.example.userservice.Services;

import com.example.userservice.Model.User;
import com.example.userservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
  @Autowired
    UserRepository userRepository;
    @Override
    public User AddNewUser(User user) {
        user = userRepository.save(user);
        return user;
    }


    @Override
    public User ShowUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> ShowUsers() {
    return userRepository.findAll();
    }

    @Override
    public void DeleteUser(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
         userRepository.delete(user);
    }

    @Override
    public User UpdateUser(User user, String id) {
        User existUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existUser.setName(user.getName());
        existUser.setEmail(user.getEmail());
        existUser.setUserRole(user.getUserRole());
        existUser.setPassword(user.getPassword());
        return userRepository.save(existUser);

    }

}
