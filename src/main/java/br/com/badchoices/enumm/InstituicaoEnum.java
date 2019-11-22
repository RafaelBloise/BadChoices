/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.enumm;

/**
 *
 * @author Rafael Bloise
 */
public enum InstituicaoEnum {
    
    BOMBEIRO("Bombeiro"),
    POLICIA_CIVIL("Polícia Civil"),
    POLICIA_MILITAR("Polícia Militar"),
    GUARDA_MUNICIPAL("Guarda Municipal"),
    SAMU("SAMU");
    
    
     private final String name;
    
    private InstituicaoEnum(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    
}
