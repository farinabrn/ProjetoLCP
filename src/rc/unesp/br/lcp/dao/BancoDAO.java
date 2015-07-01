/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.BancoModel;
import rc.unesp.br.lcp.interfaces.BancoInterface;

/**
 *
 * @author FARINA
 */
public class BancoDAO implements BancoInterface {

    private List<BancoModel> bancos;

    @Override
    public void adicionarBanco(BancoModel banco) {
    }

    @Override
    public List<BancoModel> buscarBancos() {
    }

    @Override
    public BancoModel buscarBanco(BancoModel banco) {
    }

    @Override
    public void alterarBanco(BancoModel banco) {
    }

    @Override
    public void apagarBanco(BancoModel banco) {
    }
}
