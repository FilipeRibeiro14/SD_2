package com.example.data;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import javax.persistence.*;


@Entity

public class Game {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Team> teams;
    private String name;
    private int goals1;
    private int goals2;
    private String date;
    private String location;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL) 
    private List<Event> events;



    public Game() {
    }

    public Game(String name,String date,String location,int goals1,int goals2) {
        
        this.name = name;
        this.date = date;
        this.location = location;
        this.events = new ArrayList<Event>();
        this.goals1= goals1;
        this.goals2 = goals2;
        
        //this.profs = new ArrayList<>();
    }

    public void setGoals1(int goals1) {
        this.goals1 = goals1;
    }
    public int getGoals1() {
        return this.goals1;
    }

    public void setGoals2(int goals2) {
        this.goals2 = goals2;
    }
    public int getGoals2() {
        return this.goals2;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
    

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Event> getEvents() {
        return this.events;
    }
    public void setEvents(List<Event> events) {
        this.events=events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    



   

    public String toString() {
        return this.id + "(id = " + this.id + "). ";
    }
}
