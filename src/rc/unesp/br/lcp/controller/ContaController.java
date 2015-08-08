/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Conta;
import rc.unesp.br.lcp.dao.ContaDAO;

/**
 *
 * @author FARINA
 */
public class ContaController {
    
    private ContaDAO contaDAO = new ContaDAO();

    public void adicionarConta(String descricao, Double valor, Integer tipoConta, Integer idUsuarioPagador) {
        Conta conta = new Conta(descricao, valor, tipoConta, idUsuarioPagador);
        contaDAO.adicionarConta(conta);
    }

    public List<Conta> buscarContas(Integer idConta, String descricao, Integer tipoConta, Integer idUsuarioPagador) {
        Conta conta = new Conta(descricao, null, tipoConta, idUsuarioPagador);
        return contaDAO.buscarConta(conta);
    }

    public void alterarConta(Integer idConta, String descricao, Double valor, Integer tipoConta, Integer idUsuarioPagador) {
        Conta conta = carregarConta(idConta);
        
        conta.setDescricao(descricao);
        conta.setValor(valor);
        conta.setTipoConta(tipoConta);
        conta.setIdUsuarioPagador(idUsuarioPagador);
        contaDAO.alterarConta(conta);        
    }

    public void apagarConta(Integer idConta) {
        Conta conta = carregarConta(idConta);
        contaDAO.apagarConta(conta);        
    }
    
    private Conta carregarConta(Integer idConta) {
        Conta conta = new Conta();
        conta.setIdConta(idConta);

        List<Conta> list = contaDAO.buscarConta(conta);

        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
