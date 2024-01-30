package com.realestate.service;

import com.realestate.payload.UserDto;

import java.util.Map;

public interface UserService {
    UserDto createUser(UserDto userDto);

    void verifyEmail(String email);

//    Map<String, String> loginUser(String , String );
}
