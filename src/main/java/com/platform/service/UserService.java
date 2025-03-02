package com.platform.service;

import com.platform.entity.User;
import com.platform.repository.UserRepo;
import com.platform.request.UserRequest;
import com.platform.response.UserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    public UserResponse getUserById(Long id) {
        Optional<User> user = userRepo.findById(id);
        return mapper.map(user, UserResponse.class);
    }

    public UserResponse addUser(UserRequest userRequest) {
        User user = new User(userRequest.getName(),userRequest.getMail(),userRequest.getPassword());
        User resp = userRepo.save(user);
        return mapper.map(resp, UserResponse.class);
    }


}
