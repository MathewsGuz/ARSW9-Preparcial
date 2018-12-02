/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arsw9.preparcial.entities;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author 2108263
 */
public interface ChainRepository extends MongoRepository<Chain, String>{
    public Chain findByText(String Text);
}
