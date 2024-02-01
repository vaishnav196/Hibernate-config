package com.example.vaish;

import com.example.vaish.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;
@GetMapping("/aliens")

    public List<Alien> getAlien(){
        List<Alien>aliens= repo.findAll();
        return aliens;
    }

    @GetMapping("alien/{aid}")
    public Alien getAlien(@PathVariable("aid") int aid){
        Alien alien=  repo.findById(aid).orElse(new Alien(0,""));
        return alien;
    }
    @PostMapping("alien")
    public  Alien addAlien(Alien alien){
    repo.save(alien);
    return alien;
    }
}
