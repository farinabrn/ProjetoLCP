/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Banco;
import rc.unesp.br.lcp.dao.BancoDAO;

/**
 *
 * @author FARINA
 */
public class BancoController {
    
    private BancoDAO bancoDAO = new BancoDAO();
    
    public void adicionarBanco(String descricao) {
        Banco banco = new Banco(null, descricao);
        
        bancoDAO.adicionarBanco(banco);
    }

    public List<Banco> buscarBanco(Integer idBanco, String descricao) {
        Banco banco = new Banco(idBanco, descricao);
        
        return bancoDAO.buscarBanco(banco);
    }

    public void alterarBanco(Integer idBanco, String descricao) {
        Banco banco = carregarBanco(idBanco);
        
        banco.setDescricao(descricao);
        
        bancoDAO.alterarBanco(banco);
   }

    public void apagarBanco(Integer idBanco) {
        Banco banco = carregarBanco(idBanco);

        bancoDAO.apagarBanco(banco);
    }

    private Banco carregarBanco(Integer idBanco) {
        Banco banco = new Banco();
        banco.setIdBanco(idBanco);
        
        List<Banco> list = bancoDAO.buscarBanco(banco);
        
        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
