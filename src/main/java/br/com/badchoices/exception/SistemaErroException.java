/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.exception;

import br.com.badchoices.enumm.SistemaErroEnum;

/**
 *
 * @author Matheus Monteiro
 */
public class SistemaErroException extends Exception {

    private final SistemaErroEnum erro;

    public SistemaErroException(SistemaErroEnum erro) {
        super(erro.getMensagem());
        this.erro = erro;
    }

    public SistemaErroEnum getErro() {
        return erro;
    }
    
    
}
