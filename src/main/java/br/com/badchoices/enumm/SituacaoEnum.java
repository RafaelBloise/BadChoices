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
public enum SituacaoEnum {

    ABERTO("Aberto"),
    FECHADO("Fechado"),
    EM_ANDAMENTO("Em andamento");

    private final String nome;

    private SituacaoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static SituacaoEnum retornaEnumNaPosicao(int posicao) {
        return SituacaoEnum.values()[posicao];
    }
    
}
