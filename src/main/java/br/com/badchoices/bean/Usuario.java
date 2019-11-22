/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.bean;

import br.com.badchoices.util.Util;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rafael
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false)
    private String email;
    
    @Column(length=100)
    private String senha;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcesso;
    
    @Column
    private HashMap<Stage , String > choices;
    
    
    public void setSenhaMD5(String senha) throws NoSuchAlgorithmException {
        if (StringUtils.isNotEmpty(senha) && senha.length() < 32) {
            this.senha = Util.md5(senha);
        } else {
            this.senha = senha;
        }
    }
}
