/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.BancoModel;
import rc.unesp.br.lcp.dao.BancoDAO;

/**
 *
 * @author FARINA
 */
public class BancoController {
    
    private BancoDAO bancoDAO;
    
    public void adicionarBanco(String descricao) {
        BancoModel bancoModel = new BancoModel(descricao);
        
        bancoDAO.adicionarBanco(bancoModel);
    }

    public List<BancoModel> buscarBancos() {
        return bancoDAO.buscarBancos();
    }

    public BancoModel buscarBanco(String descricao) {
        BancoModel bancoModel = new BancoModel(descricao);
        
        return bancoDAO.buscarBanco(bancoModel);
    }

    public void alterarBanco(String descricao) {
        BancoModel bancoModel = new BancoModel(descricao);
        
        bancoDAO.alterarBanco(bancoModel);
   }

    public void apagarBanco(String descricao) {
        BancoModel bancoModel = new BancoModel(descricao);
        
        bancoDAO.alterarBanco(bancoModel);
    }
}
