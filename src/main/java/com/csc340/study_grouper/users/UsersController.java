package com.csc340.study_grouper.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to map user information from the database
 * @author Adam Cichoski
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserService service;

//    /**
//     *
//     * @return
//     */
//    @GetMapping("/all")
//    public List<User> getAllUsers(){
//        return service.getAllUsers();
//    }


//    @PostMapping("/addUser")
//    public List<User> addUser(@RequestBody User user){
//        service.addUser(user);
//        return service.getAllUsers();
//    }
//
//    @GetMapping("/{uID}")
//    public User getUserByID(@PathVariable int uID){
//        return service.getUserByID(uID);
//    }

//    @PostMapping("/updateUser/{uID}")
//    public User updateUser(@PathVariable int uID, @RequestBody User newUser){
//        service.updateUser(uID, newUser);
//        return service.getUserByID(uID);
//    }

}
