/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.SituacaoUsuarioModel;
import rc.unesp.br.lcp.dao.SituacaoUsuarioDAO;

/**
 *
 * @author FARINA
 */
public class SituacaoUsuarioController {

    private SituacaoUsuarioDAO situacaoUsuarioDAO = new SituacaoUsuarioDAO();
    
    public void adicionarSituacoesUsuario(long id, String descricao) {
        SituacaoUsuarioModel situacaoUsuarioModel = new SituacaoUsuarioModel(id, descricao);
        
        situacaoUsuarioDAO.adicionarSituacoesUsuario(situacaoUsuarioModel);
    }

    public List<SituacaoUsuarioModel> buscarSituacoesUsuario() {
        return situacaoUsuarioDAO.buscarSituacoesUsuario();
    }

    public SituacaoUsuarioModel buscarSituacaoUsuario(long id, String descricao) {
        SituacaoUsuarioModel situacaoUsuarioModel = new SituacaoUsuarioModel(id, descricao);
        
        return situacaoUsuarioDAO.buscarSituacaoUsuario(situacaoUsuarioModel);
    }

    public void alterarSituacaoUsuario(long id, String descricao) {
        SituacaoUsuarioModel situacaoUsuarioModel = new SituacaoUsuarioModel(id, descricao);
        
        situacaoUsuarioDAO.alterarSituacaoUsuario(situacaoUsuarioModel);
    }

    public void apagarSituacaoUsuario(long id, String descricao) {
        SituacaoUsuarioModel situacaoUsuarioModel = new SituacaoUsuarioModel(id, descricao);
        
        situacaoUsuarioDAO.apagarSituacaoUsuario(situacaoUsuarioModel);
    }

}
