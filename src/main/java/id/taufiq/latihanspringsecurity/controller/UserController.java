package id.taufiq.latihanspringsecurity.controller;

import id.taufiq.latihanspringsecurity.model.User;
import id.taufiq.latihanspringsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public List<User> get() {
        return userService.loadAll();
    }

    @GetMapping("/message")
    @ResponseStatus(HttpStatus.OK)
    public String message() {
        return "Secret message";
    }

}
