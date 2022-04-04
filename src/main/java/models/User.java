package models;

import java.util.Objects;

public class User {
    public String userId;
    public String username;
    public String password;

    // Constructor
    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Overriding Equals() and hashcode() in order for the model to be "compatible" with "Hash Collections", e.g.
    // HashMap, HashSet.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUserId().equals(user.getUserId()) && getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUsername(), getPassword());
    }

    @Override
    public String toString() {
        return "{ userId: " + this.userId + ", username: " + this.username + ", password: " + this.password + " }";
    }
}
