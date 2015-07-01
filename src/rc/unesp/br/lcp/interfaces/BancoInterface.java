/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.BancoModel;

/**
 *
 * @author FARINA
 */
public interface BancoInterface {

    public void adicionarBanco(BancoModel banco);

    public List<BancoModel> buscarBancos();

    public BancoModel buscarBanco(BancoModel banco);

    public void alterarBanco(BancoModel banco);

    public void apagarBanco(BancoModel banco);

}
