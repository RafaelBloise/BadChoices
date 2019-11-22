/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.enumm;

/**
 *
 * @author Matheus Monteiro
 */
public enum PrioridadeEnum {
    
    ALTA("Alta"),
    MEDIA("Média"),
    BAIXA("Baixa");
    
    
    private final String name;
    
    private PrioridadeEnum(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}
