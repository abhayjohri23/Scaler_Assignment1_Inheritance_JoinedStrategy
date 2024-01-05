package com.example.demo.Service;

import com.example.demo.ModelOrEntities.PlayerDTO;
import org.springframework.stereotype.Service;

@Service("randomService")
public class RandomService {
    public PlayerDTO getPlayerByID(Integer Id){
        return PlayerDTO.builder()
                .age(26)
                .firstName("Abhay")
                .lastName("Johri")
                .id(1)
                .build();
    }
}
