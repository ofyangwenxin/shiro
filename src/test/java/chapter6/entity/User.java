package chapter6.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;

    private String salt;

    private Boolean locked = Boolean.FALSE;

    public String getCredentialsSalt() {
        return username + salt;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
