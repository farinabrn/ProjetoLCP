/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.BancoModel;

/**
 *
 * @author FARINA
 */
public interface BancoInterface {

    public List<BancoModel> getBancos();

    public BancoModel getBanco(BancoModel banco);

    public void updateBanco(BancoModel banco);

    public void deleteBanco(BancoModel banco);

}
