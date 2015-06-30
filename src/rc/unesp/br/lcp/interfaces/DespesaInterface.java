/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.DespesaModel;

/**
 *
 * @author FARINA
 */
public interface DespesaInterface {

    public List<DespesaModel> getDespesas();

    public DespesaModel getDespesa(DespesaModel Despesa);

    public void update(DespesaModel despesa);

    public void deleteDespesa(DespesaModel despesa);
}
