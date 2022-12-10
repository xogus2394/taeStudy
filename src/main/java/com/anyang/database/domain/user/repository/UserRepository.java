package com.anyang.database.domain.user.repository;

import com.anyang.database.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
