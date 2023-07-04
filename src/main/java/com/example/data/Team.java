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


@Entity

@XmlRootElement
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int numJogos;
    private int numVitorias; 
    private int numDerrotas; 
    private int numEmpates;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Player> player;

    public Team() {}

    public Team(String name, int numJogos, int numVitorias, int numDerrotas, int numEmpates) {
        this.name = name;
        this.numJogos = numJogos;
        this.numVitorias = numVitorias;
        this.numDerrotas = numDerrotas;
        this.numEmpates = numEmpates;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumJogos() {
        return numJogos;
    }

    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }
    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }
    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }




    public String getName() {
        return name;
    }

    

    

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name + " (id = " + this.id ;
    }

    public List<Player> getPlayers() {
        return this.player;
    }
}
