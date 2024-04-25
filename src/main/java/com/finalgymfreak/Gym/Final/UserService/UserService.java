package com.finalgymfreak.Gym.Final.UserService;

import com.finalgymfreak.Gym.Final.Repo.UserEntityRepo;
import com.finalgymfreak.Gym.Final.UserEntity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserEntityRepo userEntityRepo;

    public void addUser(UserEntity userEntity) {
        userEntityRepo.save(userEntity);
    }

//    public boolean authenticateUser(String userName, String password) {
//        Optional<UserEntity> userOptional = userEntityRepo.findByUserName(userName);
//        return userOptional.isPresent() && userOptional.get().getPassword().equals(password);
//    }
    public Optional<UserEntity> findThisUser(String username){
        return userEntityRepo.findByUserName(username);
    }
    public List<UserEntity> findAllUsers(){
        return userEntityRepo.findAll();
    }
}
