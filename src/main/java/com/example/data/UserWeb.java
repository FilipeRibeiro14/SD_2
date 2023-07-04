package com.example.data;



import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import javax.persistence.*;

@Entity

@Table(name = "users")
public class UserWeb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private String telephone;
    
    private String role;

    

    public UserWeb(){
        
    }

    public UserWeb(String username, String password, String email, String telephone, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.role = role;
    }
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String getEmail() {//
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
