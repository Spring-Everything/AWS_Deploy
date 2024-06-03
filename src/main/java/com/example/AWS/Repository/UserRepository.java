package com.example.AWS.Repository;

import com.example.AWS.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUid(String uid);
    boolean existsByUid(String uid);
    boolean existsByNickname(String nickname);
}

