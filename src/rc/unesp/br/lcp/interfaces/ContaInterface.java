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

    public void adicionarConta(ContaModel conta);

    public List<ContaModel> buscarContas();

    public ContaModel buscarConta(ContaModel conta);

    public void alterarConta(ContaModel conta);

    public void apagarConta(ContaModel conta);
}
