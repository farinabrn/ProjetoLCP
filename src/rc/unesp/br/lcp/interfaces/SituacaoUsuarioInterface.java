/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.SituacaoUsuarioModel;

/**
 *
 * @author FARINA
 */
public interface SituacaoUsuarioInterface {

    public List<SituacaoUsuarioModel> getSituacoesUsuario();

    public SituacaoUsuarioModel getSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario);

    public void updateSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario);

    public void deleteSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario);

}
