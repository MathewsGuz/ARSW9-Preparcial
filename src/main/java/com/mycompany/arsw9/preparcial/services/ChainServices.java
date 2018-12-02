/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arsw9.preparcial.services;

import com.mycompany.arsw9.preparcial.entities.Chain;
import com.mycompany.arsw9.preparcial.entities.ChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guzman
 */
@Service
public class ChainServices  implements CommandLineRunner {
    
    @Autowired
    private ChainRepository repo;
    
    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();
        repo.save(new Chain("heloo world"));
        System.out.println("Coneccion a la base de datos");
    }
    
    public void saveChain(String text){
        repo.save(new Chain(text));
    }
}
