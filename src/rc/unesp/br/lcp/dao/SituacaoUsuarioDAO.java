/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.SituacaoUsuarioModel;
import rc.unesp.br.lcp.interfaces.SituacaoUsuarioInterface;

/**
 *
 * @author FARINA
 */
public class SituacaoUsuarioDAO implements SituacaoUsuarioInterface {

    private List<SituacaoUsuarioModel> situacoesUsuario;

    @Override
    public void adicionarSituacoesUsuario(SituacaoUsuarioModel situacaoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SituacaoUsuarioModel> buscarSituacoesUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SituacaoUsuarioModel buscarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
