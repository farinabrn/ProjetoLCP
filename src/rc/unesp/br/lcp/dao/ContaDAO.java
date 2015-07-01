/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.ContaModel;
import rc.unesp.br.lcp.interfaces.ContaInterface;

/**
 *
 * @author FARINA
 */
public class ContaDAO implements ContaInterface {

    private List<ContaModel> contas;

    @Override
    public void adicionarConta(ContaModel conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContaModel> buscarContas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaModel buscarConta(ContaModel conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarConta(ContaModel conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarConta(ContaModel conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
