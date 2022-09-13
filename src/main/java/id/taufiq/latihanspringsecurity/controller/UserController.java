package id.taufiq.latihanspringsecurity.controller;

import id.taufiq.latihanspringsecurity.model.User;
import id.taufiq.latihanspringsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> get() {
        return userService.loadAll();
    }

}
