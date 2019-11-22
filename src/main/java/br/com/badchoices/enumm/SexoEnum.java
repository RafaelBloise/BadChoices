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
public enum SexoEnum {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String nome;

    private SexoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public static SexoEnum retornaEnumNaPosicao(int posicao) {
        return SexoEnum.values()[posicao];
    }

}
