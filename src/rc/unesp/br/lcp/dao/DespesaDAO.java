/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.DespesaModel;
import rc.unesp.br.lcp.interfaces.DespesaInterface;

/**
 *
 * @author FARINA
 */
public class DespesaDAO implements DespesaInterface {

    private List<DespesaModel> despesas;

    @Override
    public void adicionarDespesa(DespesaModel despesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DespesaModel> buscarDespesas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DespesaModel buscarDespesa(DespesaModel Despesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarDespesa(DespesaModel despesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarDespesa(DespesaModel despesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
