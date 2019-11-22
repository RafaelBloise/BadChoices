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
public enum SistemaErroEnum {
    
    EMAIL_OU_SENHA_INCORRETOS(1, "E-mail ou senha incorretos."),
    SENHAS_NAO_CONFEREM(2, "As senhas digitadas não são iguais. Por favor, digite novamente."),
    CONTRATANTE_INATIVO(3, "O contratante encontra-se desativado. Contate o suporte técnico.");

    private final int codigo;
    private final String mensagem;
    
    private SistemaErroEnum(int codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return mensagem;
    }
    public int getCodigo(){
        return codigo;
    }
    
}
