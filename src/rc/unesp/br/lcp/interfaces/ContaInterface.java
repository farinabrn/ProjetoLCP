/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.ContaModel;

/**
 *
 * @author FARINA
 */
public interface ContaInterface {

    public List<ContaModel> getContas();

    public ContaModel getConta(ContaModel conta);

    public void updateConta(ContaModel conta);

    public void deleteConta(ContaModel conta);
}
