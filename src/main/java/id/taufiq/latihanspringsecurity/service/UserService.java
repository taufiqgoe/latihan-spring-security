package id.taufiq.latihanspringsecurity.service;

import id.taufiq.latihanspringsecurity.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> loadAll();

}
