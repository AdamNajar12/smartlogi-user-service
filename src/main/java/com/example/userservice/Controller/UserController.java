package com.example.userservice.Controller;

import com.example.userservice.Model.User;
import com.example.userservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {
    @Autowired
    UserService userService;
     @PostMapping("/AddUser")
    public User addUser(@RequestBody User user)
     {
         return userService.AddNewUser(user);
     }
     @GetMapping("/ShowUers")
    public List<User> ShowUsers(){
         return  userService.ShowUsers();
     }
     @GetMapping("/GetUser/{id}")
     public User getUserById(@PathVariable String id) {
         return userService.ShowUserById(id);
     }
     @DeleteMapping("/DeleteUser/{id}")
     void DeleteUser(  @PathVariable("id") String id)
     {
         userService.DeleteUser(id);

     }
     @PutMapping("/UpdateUser/{id}")
    public User UpdateUser(@RequestBody User user , @PathVariable("id") String id)
     {
         return  userService.UpdateUser(user,id);

     }


}
