/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Divida;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.DividaDAO;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class DividaController {

    private final DividaDAO dividaDAO = new DividaDAO();
    private static UsuarioController usuarioController = new UsuarioController();

    public void adicionarDivida(Integer idUsuarioDevedor, Integer idUsuarioRecebedor, String descricao, Double preco, boolean pago) {
        
        Usuario devedor = usuarioController.buscarUsuario(idUsuarioDevedor, null, null, null).get(0);
        Usuario recebedor = usuarioController.buscarUsuario(idUsuarioRecebedor, null, null, null).get(0);
        
        Divida divida = new Divida(null, devedor, recebedor, descricao, preco, pago);
        
        dividaDAO.adicionarDivida(divida);
    }

    public List<Divida> buscarDivida(Integer idDivida, Integer idUsuarioDevedor, Integer idUsuarioRecebedor, String descricao, Double preco, boolean pago) {
        Usuario devedor = new Usuario();
        devedor.setIdUsuario(idUsuarioDevedor);
        
        Usuario recebedor = new Usuario();
        recebedor.setIdUsuario(idUsuarioRecebedor);
        
        Divida divida = new Divida(idDivida, devedor, recebedor, descricao, preco, pago);
        
        return dividaDAO.buscarDivida(divida);
    }

    public void alterarDivida(Integer idDivida, Integer idUsuarioDevedor, Integer idUsuarioRecebedor, String descricao, Double preco, boolean pago) {
        
        Divida divida = carregarDivida(idDivida);
        Usuario devedor = usuarioController.buscarUsuario(idUsuarioDevedor, null, null, null).get(0);
        Usuario recebedor = usuarioController.buscarUsuario(idUsuarioRecebedor, null, null, null).get(0);
        
        divida.setUsuarioByIdUsuarioDevedor(devedor);
        divida.setUsuarioByIdUsuarioRecebedor(recebedor);
        divida.setDescricao(descricao);
        divida.setPreco(preco);
        divida.setPago(pago);
        
        dividaDAO.alterarDivida(divida);
    }

    public void apagarDivida(Integer idDivida) {
        Divida divida = carregarDivida(idDivida);
        
        dividaDAO.apagarDivida(divida);
    }

    private Divida carregarDivida(Integer idDivida) {
        Divida divida = new Divida();
        divida.setIdDivida(idDivida);
        
        List<Divida> list = dividaDAO.buscarDivida(divida);
        
        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
}
