package me.dio.santanderbootcamp.service;

import me.dio.santanderbootcamp.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
