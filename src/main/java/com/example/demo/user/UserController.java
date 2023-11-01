package com.example.demo.user;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
@RequestMapping()
@Tag(name = "employee")
public class UserController {
    @GetMapping("/get_employees")
    public List<UserSchema> getStudents(){
      return  List.of(
              new UserSchema(
                      1L,
                      "Arnoltz",
                      "arnlotz@yahoo.com",
                      25
              )
      );
    }
}
