/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.arsw9.preparcial.db;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
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
    Application app;
    
//     @RequestMapping(method = RequestMethod.POST)	
//	public ResponseEntity<?> addChain(){
//		try {
//			//registrar dato
//                        //curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/orders -d '{"orderAmountsMap":{"HAMBURGER":2,"PIZAA":3,"BEER":2},"tableNumber":2}'
//                        app
//			return new ResponseEntity<>(HttpStatus.CREATED);
//		} catch (Exception ex) {
//			Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
//			return new ResponseEntity<>("Error Orden no puede ser Registrada ",HttpStatus.FORBIDDEN);            
//		}        
//	
//	}
}
