package com.finalgymfreak.Gym.Final.UserController;

import com.finalgymfreak.Gym.Final.UserEntity.UserEntity;
import com.finalgymfreak.Gym.Final.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign-in-section")
    public void signupUser(@RequestBody UserEntity userEntity) {
//        try {
        userService.addUser(userEntity);
//            return ResponseEntity.ok("SignUp Successful");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Signup failed. Please try again.");
//        }
    }

    @GetMapping("login-page/{username}")
    public ResponseEntity<UserEntity> loginForm(@PathVariable String username, @RequestParam String password) {
        Optional<UserEntity> userOptional = userService.findThisUser(username);

        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
//        return userService.findThisUser(username);
//    }
//    @GetMapping("login-page")
//    public List<UserEntity> allUsersList(){
//        return userService.findAllUsers();
//    }
//}
//    @PatchMapping("edit/{userName}")
//    public String updateUser(@PathVariable String userName,@RequestBody UserEntity newUser){
//        Optional<UserEntity> oldUser = userService.findThisUser(userName);
//        UserEntity.
//        return "user updated";
//    }
//}