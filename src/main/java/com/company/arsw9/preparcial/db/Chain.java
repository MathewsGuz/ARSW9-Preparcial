/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.arsw9.preparcial.db;
import java.util.Date;
import org.springframework.data.annotation.Id;
/**
 *
 * @author 2108263
 */
public class Chain {
    
    @Id
    public String id;
    public String text;
    public Date date=new Date();



    public Chain(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, String='%s', Date='%s']",
            id, text, date);
    }
        
}

