/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.sql.Timestamp;
import rc.unesp.br.lcp.beans.ContaBancariaModel;
import rc.unesp.br.lcp.beans.SituacaoUsuarioModel;
import rc.unesp.br.lcp.beans.UsuarioModel;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class UsuarioController {
    
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void adicionarUsuario(long id,
            String nome,
            String apelido,
            String cpf,
            Timestamp dataInicio,
            Timestamp dataTermino,
            SituacaoUsuarioModel situacaoUsuario,
            String telefoneCelular,
            String telefoneResidencial,
            String email,
            ContaBancariaModel contaBancaria) {
        
        UsuarioModel usuarioModel = new UsuarioModel(id, nome, apelido, cpf, null, null, null, telefoneCelular, telefoneResidencial, email, null);
        
        usuarioDAO.adicionarUsuario(usuarioModel);
    }
    
    @Override
    public List<UsuarioModel> buscarUsuarios() {
        return this.usuarios;
    }

    @Override
    public UsuarioModel buscarUsuario(UsuarioModel usuario) {
        if (usuario != null) {
            return buscaUsuarioPorID(usuario.getId());
        }
        
        return null;
    }

    @Override
    public void alterarUsuario(UsuarioModel usuario) {
        usuarios.set(usuarios.indexOf(buscaUsuarioPorID(usuario.getId())), usuario);
    }

    @Override
    public void apagarUsuario(UsuarioModel usuario) {
        usuarios.remove(usuarios.indexOf(buscaUsuarioPorID(usuario.getId())));
    }

    private UsuarioModel buscaUsuarioPorID(Long idUsuario) {
        for (UsuarioModel usuario : usuarios) {
            if (usuario.getId() == idUsuario)
                return usuario;
        }
        
        return null;
    }
}
