package com.example.demo.Controller;

import com.example.demo.ModelOrEntities.PlayerDTO;
import com.example.demo.Service.RandomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class MyController {
    private final RandomService randomService;
    public MyController(RandomService randomService){
        this.randomService = randomService;
    }

    @GetMapping("/{id}")
    public PlayerDTO getPlayerByID(@PathVariable("id") Integer id){
        return this.randomService.getPlayerByID(id);
    }
}
