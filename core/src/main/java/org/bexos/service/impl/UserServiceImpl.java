package org.bexos.service.impl;

import lombok.RequiredArgsConstructor;
import org.bexos.dto.UserRequest;
import org.bexos.model.User;
import org.bexos.repository.UserRepository;
import org.bexos.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(UserRequest userRequest) {
        User user = User.builder()
                .email(userRequest.email())
                .username(userRequest.username())
                .password(userRequest.password())
                .build();

        return userRepository.save(user);
    }

    public User findUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

}
