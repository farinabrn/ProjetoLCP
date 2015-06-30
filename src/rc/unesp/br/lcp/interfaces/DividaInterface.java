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

    public List<DividaModel> getDividas();

    public DividaModel getDivida(DividaModel Divida);

    public void updateDivida(DividaModel divida);

    public void deleteDivida(DividaModel divida);
}
