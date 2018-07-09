package com.link.springforms.domain;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
    @Id
    @Column(length=20)
    private String name;

    @Basic(optional = false)
    private String coach;

    @OneToMany(mappedBy = "team")
    private Set<Player> players;

    public String getName() {
        return this.name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return this.coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Set<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}