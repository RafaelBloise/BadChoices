/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.exception;

/**
 *
 * @author Rafael Bloise
 */
public class AvoidDuplicationEmailException extends Exception {

    public AvoidDuplicationEmailException() {
        super("Email já está cadastrado");
    }
}
