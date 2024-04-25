package com.finalgymfreak.Gym.Final.UserEntity;

import jakarta.persistence.*;

@Entity
@Table(name="userTable")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String fullName;
    @Column(unique = true)
    private String userName;

    private String email;

    private String contact;

    private String password;

    public UserEntity(Long id, String fullName, String userName, String email, String contact, String password) {
        super();
        this.userId = id;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.contact = contact;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEntity() {
        super();
    }
}
