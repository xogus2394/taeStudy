package com.anyang.database.domain.user.service;

import com.anyang.database.domain.user.entity.User;
import com.anyang.database.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void register(User user){
        userRepository.save(user);
    }
    public List<User> list() {
        return userRepository.findAll(Sort.by(Sort.Direction.DESC, "idx"));
    }
    public User detail(int idx) {
        return userRepository.findById(idx).orElse(null);
    }
    public void update(User user) {
        userRepository.save(user);
    }
    public void delete(int idx) {
        userRepository.deleteById(idx);
    }
}
