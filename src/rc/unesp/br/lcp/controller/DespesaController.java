/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Despesa;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.DespesaDAO;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class DespesaController {
    
    private DespesaDAO despesaDAO;
    private UsuarioDAO usuarioDAO;

    public void adicionarDespesa(Integer idUsuarioComprador, String descricao, Double preco) {
        Usuario comprador = carregarUsuario(idUsuarioComprador);
        
        Despesa despesa = new Despesa(null, comprador, descricao, preco);
        
        despesaDAO.adicionarDespesa(despesa);
    }

    public List<Despesa> buscarDespesas(Integer idDespesa, Integer idUsuarioComprador, String descricao, Double preco) {
        Usuario comprador = carregarUsuario(idUsuarioComprador);
        
        Despesa despesa = new Despesa(idDespesa, comprador, descricao, preco);
        
        return despesaDAO.buscarDespesa(despesa);
    }

    public List<Despesa> buscarDespesa(Integer idDespesa, Integer idUsuarioComprador, String descricao, Double preco) {
        Usuario comprador = new Usuario();
        comprador.setIdUsuario(idUsuarioComprador);
        
        Despesa despesa = new Despesa(idDespesa, comprador, descricao, preco);
        
        return despesaDAO.buscarDespesa(despesa);
    }

    public void alterarDespesa(Integer idDespesa, Integer idUsuarioComprador, String descricao, Double preco) {
        Despesa despesa = carregarDespesa(idDespesa);
        Usuario comprador = carregarUsuario(idUsuarioComprador);
        
        despesa.setUsuarioByIdUsuario(comprador);
        despesa.setDescricao(descricao);
        despesa.setPreco(preco);
        
        despesaDAO.alterarDespesa(despesa);
    }

    public void apagarDespesa(Integer idDespesa) {
        Despesa despesa = carregarDespesa(idDespesa);
        
        despesaDAO.apagarDespesa(despesa);
    }
    
    private Despesa carregarDespesa(Integer idDespesa) {
        Despesa despesa = new Despesa();
        despesa.setIdDespesa(idDespesa);
        
        List<Despesa> list = despesaDAO.buscarDespesa(despesa);
        
        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
    
    private Usuario carregarUsuario(Integer idUsuario) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        
//        List<Usuario> listUsuario = UsuarioDAO.carregarUsuario(comprador);
//        
//        if (listUsuario == null || listUsuario.size() != 1) {
//            throw new Exception("Usuario inválido!");
//            
//        } else {
//            usuario = listUsuario.get(0);
//        }

        return usuario;
    }
}
