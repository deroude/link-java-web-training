package com.link.springforms.controller;

import com.link.springforms.domain.Team;
import com.link.springforms.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    private final TeamRepository repository;

    @Autowired
    public TeamController(TeamRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getTeams(Model model) {
        model.addAttribute("teamList", repository.findAll());
        if (!model.containsAttribute("selectedTeam"))
            model.addAttribute("selectedTeam", new Team());
        return "teampage";
    }

    @GetMapping("/{name}")
    public String getTeam(@PathVariable("name") String name, Model model) {
        model.addAttribute("selectedTeam", repository.findById(name).get());
        return getTeams(model);
    }

    @PostMapping("/{name}")
    public String saveTeam(@PathVariable("name") String name, @ModelAttribute Team team, Model model) {
        this.repository.saveAndFlush(team);
        return getTeam(name, model);
    }
}