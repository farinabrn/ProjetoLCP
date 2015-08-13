/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Banco;
import rc.unesp.br.lcp.beans.ContaBancaria;
import rc.unesp.br.lcp.dao.ContaBancariaDAO;

/**
 *
 * @author FARINA
 */
public class ContaBancariaController {
    
    private ContaBancariaDAO contaBancariaDAO = new ContaBancariaDAO();

    public void adicionarContaBancaria(Banco banco, String agencia, String conta) {
        ContaBancaria contaBancaria = new ContaBancaria(null, banco, agencia, conta);
        contaBancariaDAO.adicionarContaBancaria(contaBancaria);     
    }
    
    private ContaBancaria carregarContaBancaria(Integer idContaBancaria) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setIdContaBancaria(idContaBancaria);

        List<ContaBancaria> list = contaBancariaDAO.buscarContaBancaria(contaBancaria);

        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
