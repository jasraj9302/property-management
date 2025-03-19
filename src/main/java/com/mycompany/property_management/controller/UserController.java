package com.mycompany.property_management.controller;


import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.dto.UserDTO;
import com.mycompany.property_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO) {

        userDTO =userService.register(userDTO);

        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

    }
}
