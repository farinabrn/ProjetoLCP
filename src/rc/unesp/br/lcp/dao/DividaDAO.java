/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import rc.unesp.br.lcp.beans.DividaModel;
import rc.unesp.br.lcp.interfaces.DividaInterface;

/**
 *
 * @author FARINA
 */
public class DividaDAO implements DividaInterface {

    private List<DividaModel> dividas;

    @Override
    public void adicionarDivida(DividaModel divida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DividaModel> buscarDividas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DividaModel buscarDivida(DividaModel Divida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarDivida(DividaModel divida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarDivida(DividaModel divida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
