package com.diary.diaryproject.domain.repository;

import com.diary.diaryproject.domain.aggregate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;


public interface UserRepository extends JpaRepository <User,String> {
    User save(User user);

    Optional<User> findById(String id);
}
