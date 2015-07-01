/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.DividaModel;

/**
 *
 * @author FARINA
 */
public interface DividaInterface {

    public void adicionarDivida(DividaModel divida);

    public List<DividaModel> buscarDividas();

    public DividaModel buscarDivida(DividaModel Divida);

    public void alterarDivida(DividaModel divida);

    public void apagarDivida(DividaModel divida);
}
