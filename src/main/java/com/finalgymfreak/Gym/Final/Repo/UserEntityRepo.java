package com.finalgymfreak.Gym.Final.Repo;

import com.finalgymfreak.Gym.Final.UserEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepo extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUserName(String username);
}
