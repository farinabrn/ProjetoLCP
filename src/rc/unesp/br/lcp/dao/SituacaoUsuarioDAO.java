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
    }

    @Override
    public List<SituacaoUsuarioModel> buscarSituacoesUsuario() {
        return null;
    }

    @Override
    public SituacaoUsuarioModel buscarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
        return null;
    }

    @Override
    public void alterarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
    }

    @Override
    public void apagarSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
    }

}
