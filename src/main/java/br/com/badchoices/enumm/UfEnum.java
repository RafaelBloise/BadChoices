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
public enum UfEnum {
     AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, 
    PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;



    public static UfEnum retornaEnumNaPosicao(int posicao) {
        return UfEnum.values()[posicao];
    }
}
