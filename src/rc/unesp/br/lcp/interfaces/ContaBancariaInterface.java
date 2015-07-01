/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.ContaBancariaModel;

/**
 *
 * @author FARINA
 */
public interface ContaBancariaInterface {

    public void adicionarContasBancarias(ContaBancariaModel contaBancaria);

    public List<ContaBancariaModel> buscarContasBancarias();

    public ContaBancariaModel buscarContaBancaria(ContaBancariaModel contaBancaria);

    public void alterarContaBancaria(ContaBancariaModel contaBancaria);

    public void apagarContaBancaria(ContaBancariaModel contaBancaria);

}
