package com.example.data;

import java.util.List;

import javax.persistence.*;



@Entity
//@XmlRootElement
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String time;
    @ManyToOne(optional = false)
    private Game game;
    

    public Event() {
    }

    public Event(String type, String time) {
        this.type = type;
        this.time = time;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getTime() {
        return time;
    }

   // @XmlElementWrapper(name="teams")
   // @XmlElement(name="team")

    public void setType(String type) {
        this.type = type;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    public String toString() {
        return this.type + " (id=";
    }

    /*public List<Student> getStudents() {
        return this.st;
    }*/
}
