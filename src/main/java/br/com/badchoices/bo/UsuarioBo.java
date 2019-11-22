/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.badchoices.bo;

import br.com.badchoices.bean.Usuario;
import br.com.badchoices.dao.UsuarioDao;
import br.com.badchoices.enumm.SistemaErroEnum;
import br.com.badchoices.exception.AvoidDuplicationEmailException;
import br.com.badchoices.exception.SistemaErroException;
import br.com.badchoices.util.Util;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author rafael
 */
@Service
public class UsuarioBo {
    
    @Autowired
    private UsuarioDao dao;

   
    public Usuario login(String email, String senha) throws NoSuchAlgorithmException, SistemaErroException {

        Optional<Usuario> usuarioEncontrado = findByEmailAndSenha(
                email, Util.md5(senha));

        if (!usuarioEncontrado.isPresent()) {
            throw new SistemaErroException(SistemaErroEnum.EMAIL_OU_SENHA_INCORRETOS);
        }
        
        
        return usuarioEncontrado.get();

    }

    public boolean isNewUsuario(Usuario usuario) throws NoSuchAlgorithmException {

        String password = usuario.getSenha();
        Date ultimoAcesso = usuario.getUltimoAcesso();

        return (password.equals(Util.md5("password")) && ultimoAcesso == null);
    }

    public Usuario save(Usuario usuario) {
         return dao.save(usuario);
    }

    public Usuario cadastrar(Usuario usuario) throws AvoidDuplicationEmailException {
         if (dao.findByEmail(usuario.getEmail()) != null) {
            throw new AvoidDuplicationEmailException();
        }
        return dao.save(usuario);
    }

    public List<Usuario> findAll() {
        return dao.findAll();
    }



    public List<Usuario> saveAll(List<Usuario> usuarios) {
        return dao.saveAll(usuarios);
    }

    public Optional<Usuario> findByEmailAndSenha(String email, String senha) {
        return dao.findByEmailAndSenha(email, senha);
    }

    
}
