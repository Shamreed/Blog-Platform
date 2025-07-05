package com.blogplatform.blog.services;

import com.blogplatform.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
