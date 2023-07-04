package com.example.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String posicao;
    @ManyToOne(cascade = CascadeType.ALL)
    private Team team;
    private int goals;
    
    
    public Player() {
    }
    
    public Player(String name, int age, String posicao,int goals) {
        this.name = name;
        this.posicao = posicao;
        this.age = age;
        this.goals = goals;
        
        
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    @XmlElementWrapper(name = "teams")
    @XmlElement(name = "team") 
    public Team getTeam() {
        return team;
    }
    
    public void setTeam(Team teams) {
        this.team = teams;
    }
    public String getPosicao() {
        return posicao;
    }
    
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getGoals() {
        return goals;
    }
    
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public void addGoals() {
        this.goals++;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String toString() {
        return this.name + "(id = " + this.id + this.age;
    }
}
