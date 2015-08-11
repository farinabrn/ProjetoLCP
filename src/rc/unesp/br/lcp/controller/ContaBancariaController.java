/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Contabancaria;
import rc.unesp.br.lcp.dao.ContaBancariaDAO;

/**
 *
 * @author FARINA
 */
public class ContaBancariaController {
    
    private ContaBancariaDAO contaBancariaDAO = new ContaBancariaDAO();

    public void adicionarContaBancaria(String idBanco, String agencia, String conta) {
        Contabancaria contaBancaria = new Contabancaria(null, null, agencia, conta, idBanco, null);
        
        contaBancariaDAO.adicionarContaBancaria(contaBancaria);     
    }

    public List<Contabancaria> buscarContasBancarias(Integer idContaBancaria, String idBanco, String agencia, String conta) {
        Contabancaria contaBancaria = new Contabancaria(null, idContaBancaria, agencia, conta, idBanco, null);
        return contaBancariaDAO.buscarContaBancaria(contaBancaria);  
    }

    public void alterarContaBancaria(Integer idContaBancaria, String idBanco, String agencia, String conta) {
        Contabancaria contaBancaria = carregarContaBancaria(idContaBancaria);
        
        contaBancaria.setAgencia(agencia);
        contaBancaria.setConta(conta);
        contaBancaria.setIdBanco(idBanco);
        
        contaBancariaDAO.alterarContaBancaria(contaBancaria);      
    }

    public void apagarContaBancaria(Integer idContaBancaria) {
        Contabancaria contaBancaria = carregarContaBancaria(idContaBancaria);
        
        contaBancariaDAO.apagarContaBancaria(contaBancaria);
    }
    
    private Contabancaria carregarContaBancaria(Integer idContaBancaria) {
        Contabancaria contaBancaria = new Contabancaria();
        contaBancaria.setIdContaBancaria(idContaBancaria);

        List<Contabancaria> list = contaBancariaDAO.buscarContaBancaria(contaBancaria);

        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
