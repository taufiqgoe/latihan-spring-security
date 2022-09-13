package id.taufiq.latihanspringsecurity.service.impl;

import id.taufiq.latihanspringsecurity.model.User;
import id.taufiq.latihanspringsecurity.repository.UserRepository;
import id.taufiq.latihanspringsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        return userRepository.save(userWithEncodedPassword(user));
    }

    @Override
    public List<User> loadAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Not found"));
    }

    private User userWithEncodedPassword(User user) {
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        return user;
    }
}
