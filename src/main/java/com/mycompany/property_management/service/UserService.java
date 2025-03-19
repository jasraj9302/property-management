package com.mycompany.property_management.service;

import com.mycompany.property_management.dto.UserDTO;

public interface UserService {

    UserDTO register(UserDTO userDTO);
    UserDTO login(String email,String password );

}
