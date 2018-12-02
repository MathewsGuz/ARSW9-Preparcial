/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arsw9.preparcial.controller;


import com.mycompany.arsw9.preparcial.services.ChainServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author 2108263
 */
@RestController
@RequestMapping(value = "/chain")
@Service
public class ChainApiController {
    @Autowired
    ChainServices app;
    
     @RequestMapping(method = RequestMethod.POST)	
	public ResponseEntity<?> addChain(@RequestBody String text){
            try {
                //curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/chain -d '{"orderAmountsMap":{"HAMBURGER":2,"PIZAA":3,"BEER":2},"tableNumber":2}'
                    //registrar dato
                    //curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/chain -d 'hola diana'
                    app.saveChain(text);
                    return new ResponseEntity<>("Insercion a db",HttpStatus.CREATED);
            } catch (Exception ex) {
                    Logger.getLogger(ChainServices.class.getName()).log(Level.SEVERE, null, ex);
                    return new ResponseEntity<>("Error texto no puede ser Registrado ",HttpStatus.FORBIDDEN);            
            }        
	
	}
}
