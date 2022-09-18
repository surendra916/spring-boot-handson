package com.ssr.learning.controller;

import com.ssr.learning.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/error")
    public String wish(){
        return "This is soo cool OMG!!!, Its heavy great";
    }

    // Return user object which gets converted & sent as json
    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId(String.valueOf(1));
        user.setName("Ravi");
        user.setEmail("ravi@gmail.com");
        return user;
    }

    // http://localhost:8080/user/1/ravi/ravi@gmail.com
    // Use @PathVariable only if data is mandatory.
    @GetMapping("/{id}/{name}/{email}")
    public String getUserByPathVar(@PathVariable(required = false) Map<Optional<String>, String> userMap){
        String msg;
        msg = userMap.get("id") + userMap.get("name") + userMap.get("email");
        return msg;
    }

    //http://localhost:8080/user/requestParams/?id=1
    // use QueryParams if data input is not mandatory
    @GetMapping("/requestParams")
    public String getRequestParams(@RequestParam(name = "id") Optional<String> userId){
        String msg = userId.isPresent() ? userId.get() : "booommm";
        return msg;
    }

}
