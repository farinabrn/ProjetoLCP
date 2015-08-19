/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import rc.unesp.br.lcp.beans.ContaBancaria;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class UsuarioController {
    
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void adicionarUsuario(Integer idUsuario,
            ContaBancaria contaBancaria,
            String nome,
            String apelido,
            String cpf,
            Date dataInicio,
            Date dataTermino,
            Integer situacaoUsuario,
            String telefoneCelular,
            String telefoneResidencial,
            String email) {
        Usuario usuario = new Usuario(contaBancaria, nome, apelido, cpf, dataInicio, 
                dataTermino, situacaoUsuario, telefoneResidencial, telefoneCelular, email, null, null);
        
        usuarioDAO.adicionarUsuario(usuario);      
    }
    
    public Usuario carregarUsuario(Integer idUsuario) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        
        List<Usuario> list = usuarioDAO.buscarUsuario(usuario);
        
        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
    
    public List<Usuario> buscarUsuario (Integer idUsuario, String nome, String apelido, String cpf) {
        Usuario usuario = new Usuario(null, nome, apelido, cpf, null, null, null, null, null, null, null, null);
        return usuarioDAO.buscarUsuario(usuario);
    }

    public void alterarUsuario(Integer idUsuario,
            ContaBancaria contaBancaria,
            String nome,
            String apelido,
            String cpf,
            Date dataInicio,
            Date dataTermino,
            Integer situacaoUsuario,
            String telefoneCelular,
            String telefoneResidencial,
            String email) {
        Usuario usuario = carregarUsuario(idUsuario);
        usuario.setNome(nome);
        usuario.setApelido(apelido);
        usuario.setCpf(cpf);
        usuario.setDataInicio(dataInicio);
        usuario.setDataTermino(dataTermino);
        usuario.setSituacaoUsuario(situacaoUsuario);
        usuario.setTelefoneCelular(telefoneCelular);
        usuario.setTelefoneResidencial(telefoneResidencial);
        usuario.setEmail(email);
        usuarioDAO.alterarUsuario(usuario);
    }

    public void apagarUsuario(Integer idUsuario) {
        Usuario usuario = carregarUsuario(idUsuario);
        
        usuarioDAO.apagarUsuario(usuario);
    }
}
