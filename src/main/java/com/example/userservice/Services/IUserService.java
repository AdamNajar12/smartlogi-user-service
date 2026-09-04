package com.example.userservice.Services;

import com.example.userservice.Model.User;

import java.util.List;

public interface IUserService {
    public User AddNewUser(User user);

    public User ShowUserById(String id);
    public List<User> ShowUsers();

    public void DeleteUser(String id);
    public User UpdateUser(User user , String id) ;

}
