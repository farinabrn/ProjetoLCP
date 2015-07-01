/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.BancoModel;
import rc.unesp.br.lcp.beans.ContaBancariaModel;
import rc.unesp.br.lcp.beans.SituacaoUsuarioModel;
import rc.unesp.br.lcp.dao.ContaBancariaDAO;

/**
 *
 * @author FARINA
 */
public class ContaBancariaController {
    
    private ContaBancariaDAO contaBancariaDAO = new ContaBancariaDAO();

    public void adicionarContasBancarias(BancoModel banco, String agencia, String conta) {
        ContaBancariaModel contaBancariaModel = new ContaBancariaModel(banco, agencia, conta);
        contaBancariaDAO.adicionarContasBancarias(contaBancariaModel);        
    }

    public List<ContaBancariaModel> buscarContasBancarias() {
        return contaBancariaDAO.buscarContasBancarias();  
    }

    public ContaBancariaModel buscarContaBancaria(BancoModel banco, String agencia, String conta) {
        ContaBancariaModel contaBancariaModel = new ContaBancariaModel(banco, agencia, conta);
        return contaBancariaDAO.buscarContaBancaria(contaBancariaModel);
    }

    public void alterarContaBancaria(BancoModel banco, String agencia, String conta) {
        ContaBancariaModel contaBancariaModel = new ContaBancariaModel(banco, agencia, conta);
        contaBancariaDAO.alterarContaBancaria(contaBancariaModel);        
    }

    public void apagarContaBancaria(BancoModel banco, String agencia, String conta) {
        ContaBancariaModel contaBancariaModel = new ContaBancariaModel(banco, agencia, conta);
        contaBancariaDAO.apagarContaBancaria(contaBancariaModel);
    }
}
