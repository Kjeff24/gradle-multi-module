package org.bexos.service;

import org.bexos.dto.UserRequest;
import org.bexos.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User addUser(UserRequest userRequest);

    User findUserById(Integer userId);
}
