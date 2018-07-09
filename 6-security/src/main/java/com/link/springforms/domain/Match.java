package com.link.springforms.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="game")
public class Match{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    private Team home;

    @ManyToOne
    private Team away;

    private Integer homeScore=0;

    private Integer awayScore=0;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }
    public void setDategetDate(Date date) {
        this.date = date;
    }

    public Team getHome() {
        return this.home;
    }
    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return this.away;
    }
    public void setAway(Team away) {
        this.away = away;
    }

    public int getHomeScore() {
        return this.homeScore;
    }
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return this.awayScore;
    }
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
}