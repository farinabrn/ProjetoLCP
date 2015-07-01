/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.DividaModel;
import rc.unesp.br.lcp.beans.UsuarioModel;
import rc.unesp.br.lcp.dao.DividaDAO;

/**
 *
 * @author FARINA
 */
public class DividaController {

    private DividaDAO dividaDAO = new DividaDAO();

    public void adicionarDivida(UsuarioModel devedor, UsuarioModel recebedor, String descricao, Double preco) {
        DividaModel dividaModel = new DividaModel(devedor, recebedor, descricao, preco);
        
        dividaDAO.adicionarDivida(dividaModel);
    }

    public List<DividaModel> buscarDividas() {
        return dividaDAO.buscarDividas();
    }

    public DividaModel buscarDivida(UsuarioModel devedor, UsuarioModel recebedor, String descricao, Double preco) {
        DividaModel dividaModel = new DividaModel(devedor, recebedor, descricao, preco);
        
        return dividaDAO.buscarDivida(dividaModel);
    }

    public void alterarDivida(UsuarioModel devedor, UsuarioModel recebedor, String descricao, Double preco) {
        DividaModel dividaModel = new DividaModel(devedor, recebedor, descricao, preco);
        
        dividaDAO.alterarDivida(dividaModel);
    }

    public void apagarDivida(UsuarioModel devedor, UsuarioModel recebedor, String descricao, Double preco) {
        DividaModel dividaModel = new DividaModel(devedor, recebedor, descricao, preco);
        
        dividaDAO.apagarDivida(dividaModel);
    }

}
