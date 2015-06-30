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
    public List<ContaBancariaModel> getContasBancarias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaBancariaModel getContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteContaBancaria(ContaBancariaModel contaBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
