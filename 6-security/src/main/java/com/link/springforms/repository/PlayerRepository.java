package com.link.springforms.repository;

import java.util.Set;

import com.link.springforms.domain.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    public Set<Player> findByTeamName(String name);
}