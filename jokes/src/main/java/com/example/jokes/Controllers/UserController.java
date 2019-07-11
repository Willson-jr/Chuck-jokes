package com.example.jokes.Controllers;

import com.example.jokes.Admin;
import com.example.jokes.RegularUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users")
    public String getUsers(ModelMap modelMap){
        RegularUser user = new RegularUser("adam","kowalski");
        RegularUser user2 = new RegularUser("adam2","kowalski");

        Admin admin1 = new Admin("admin","kowalski");
        Admin admin2 = new Admin("admin1","kowalski");
        Admin admin3 = new Admin("admin2","kowalski");

        List<User> users= new ArrayList<>();
        //POLIFORMIZM - Admin traktowany jako User
        users.add(user);
        users.add(user2);
        users.add(admin1);
        users.add(admin2);
        users.add(admin3);

        modelMap.put("users",users);
        return "users";
    }
}
