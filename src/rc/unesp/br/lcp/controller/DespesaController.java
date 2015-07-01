/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.DespesaModel;
import rc.unesp.br.lcp.beans.UsuarioModel;
import rc.unesp.br.lcp.dao.DespesaDAO;

/**
 *
 * @author FARINA
 */
public class DespesaController {
    
    private DespesaDAO despesaDAO = new DespesaDAO();

    public void adicionarDespesa(UsuarioModel comprador, String descricao, Double preco) {
        DespesaModel despesaModel = new DespesaModel(comprador, descricao, preco);
        
        despesaDAO.adicionarDespesa(despesaModel);
    }

    public List<DespesaModel> buscarDespesas() {
        return despesaDAO.buscarDespesas();
    }

    public DespesaModel buscarDespesa(UsuarioModel comprador, String descricao, Double preco) {
        DespesaModel despesaModel = new DespesaModel(comprador, descricao, preco);
        
        return despesaDAO.buscarDespesa(despesaModel);
    }

    public void alterarDespesa(UsuarioModel comprador, String descricao, Double preco) {
        DespesaModel despesaModel = new DespesaModel(comprador, descricao, preco);
        
        despesaDAO.alterarDespesa(despesaModel);
    }

    public void apagarDespesa(UsuarioModel comprador, String descricao, Double preco) {
        DespesaModel despesaModel = new DespesaModel(comprador, descricao, preco);
        
        despesaDAO.apagarDespesa(despesaModel);
    }
    
}
