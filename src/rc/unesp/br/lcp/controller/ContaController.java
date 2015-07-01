/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.ContaModel;
import rc.unesp.br.lcp.dao.ContaDAO;

/**
 *
 * @author FARINA
 */
public class ContaController {
    
    private ContaDAO contaDAO = new ContaDAO();

    public void adicionarConta(String descricao, Double preco) {
        ContaModel contaModel = new ContaModel(descricao, preco);
        contaDAO.adicionarConta(contaModel);
    }

    public List<ContaModel> buscarContas() {
        return contaDAO.buscarContas();
    }

    public ContaModel buscarConta(String descricao, Double preco) {
        ContaModel contaModel = new ContaModel(descricao, preco);
        return contaDAO.buscarConta(contaModel);        
    }

    public void alterarConta(String descricao, Double preco) {
        ContaModel contaModel = new ContaModel(descricao, preco);
        contaDAO.alterarConta(contaModel);        
    }

    public void apagarConta(String descricao, Double preco) {
        ContaModel contaModel = new ContaModel(descricao, preco);
        contaDAO.apagarConta(contaModel);        
    }
    
}
