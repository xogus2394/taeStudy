package com.anyang.database.domain.user.controller;

import com.anyang.database.domain.user.entity.User;
import com.anyang.database.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/list")
    public String list(Model model) {

        model.addAttribute("user", userService);
        return "list";
    }
    @GetMapping("/register")
    public String registerGet() {
        return "register";
    }
    @PostMapping("/register")
    public String registerPost(User user) {
        userService.register(user);
        return "redirect:/board/list";
    }
    @GetMapping("/update/{idx}")
    public String updateGet(@PathVariable int idx, Model model) {
        model.addAttribute("user", userService.detail(idx));
        return "update";
    }
    @PostMapping("/update")
    public String updatePost(User user) {
        userService.update(user);
        return "redirect:/use/list";
    }
    @GetMapping("/delete/{idx}")
    public String delete(@PathVariable int idx) {

        userService.delete(idx);
        return "redirect:/board/list";
    }
}
