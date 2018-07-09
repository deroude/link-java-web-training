package com.link.springforms.repository;

import java.util.List;

import com.link.springforms.domain.Match;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, String> {
    @Query("select m from Match m join m.home h join m.away a where h.name=:team or a.name=:team")
    public List<Match> findByTeam(@Param("team") String teamName);
}