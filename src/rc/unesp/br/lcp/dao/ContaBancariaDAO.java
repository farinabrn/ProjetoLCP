/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.ContaBancariaModel;
import rc.unesp.br.lcp.interfaces.ContaBancariaInterface;

/**
 *
 * @author FARINA
 */
public class ContaBancariaDAO implements ContaBancariaInterface {

    private List<ContaBancariaModel> contasBancarias;

    @Override
    public void adicionarContasBancarias(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContaBancariaModel> buscarContasBancarias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaBancariaModel buscarContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
