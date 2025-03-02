package com.platform.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int userID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String mail;

    @Column(name = "Password")
    private String password;

    public User(String username, String email, String password) {
        this.name = username;
        this.mail = email;
        this.password = password;
    }
}
