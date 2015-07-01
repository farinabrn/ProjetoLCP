/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.sql.Timestamp;
import java.util.List;
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
        UsuarioModel usuarioModel = new UsuarioModel(id, nome, apelido, cpf, dataInicio, dataTermino, situacaoUsuario, telefoneCelular, telefoneResidencial, email, contaBancaria);
        
        usuarioDAO.adicionarUsuario(usuarioModel);
    }
    
    public List<UsuarioModel> buscarUsuarios() {
        return usuarioDAO.buscarUsuarios();
    }

    public UsuarioModel buscarUsuario(long id,
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
        UsuarioModel usuarioModel = new UsuarioModel(id, nome, apelido, cpf, dataInicio, dataTermino, situacaoUsuario, telefoneCelular, telefoneResidencial, email, contaBancaria);
        
        return usuarioDAO.buscarUsuario(usuarioModel);
    }

    public void alterarUsuario(long id,
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
        UsuarioModel usuarioModel = new UsuarioModel(id, nome, apelido, cpf, dataInicio, dataTermino, situacaoUsuario, telefoneCelular, telefoneResidencial, email, contaBancaria);
        
        usuarioDAO.alterarUsuario(usuarioModel);
    }

    public void apagarUsuario(long id,
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
        UsuarioModel usuarioModel = new UsuarioModel(id, nome, apelido, cpf, dataInicio, dataTermino, situacaoUsuario, telefoneCelular, telefoneResidencial, email, contaBancaria);
        
        usuarioDAO.apagarUsuario(usuarioModel);
    }
}
