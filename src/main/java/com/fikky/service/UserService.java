package com.fikky.service;

import com.fikky.models.User;

public interface UserService extends CRUDService<User> {
  User findByUsername(String username);
}
