package com.example.futurarma.controller;

import com.example.futurarma.entity.UserEntity;
import com.example.futurarma.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> getAll() {
    return userService.getAll();
}
    @GetMapping("/{id}")
    public UserEntity getById(
            @PathVariable Long id) {

        return userService.find(id);
    }
      @DeleteMapping("/{id}")
public void delete(
        @PathVariable Long id) {

    userService.delete(id);
    }
    @PostMapping
    public UserEntity create(
            @RequestBody UserEntity user) {
        return userService.create(user);
    }
    @PostMapping("/{id}")
public UserEntity login(
        @RequestParam String username) {
    return userService.login(username);
    }
}
