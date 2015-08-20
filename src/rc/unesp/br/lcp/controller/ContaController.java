/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Conta;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.ContaDAO;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class ContaController {

    private final ContaDAO contaDAO = new ContaDAO();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void adicionarConta(Integer idUsuarioPagador, String descricao, Double valor) throws Exception{
        Usuario pagador = carregarUsuario(idUsuarioPagador);
        
        Conta conta = new Conta(null, pagador, descricao, valor);
        contaDAO.adicionarConta(conta);
    }

    public List<Conta> buscarContas(Integer idConta, Integer idUsuarioPagador, String descricao, Double valor) {
        Usuario pagador = null;
        
        if (idUsuarioPagador != null) {
            pagador = new Usuario();
            pagador.setIdUsuario(idUsuarioPagador);
        }

        Conta conta = new Conta(idConta, pagador, descricao, valor);
        
        return contaDAO.buscarConta(conta);
    }

    public void alterarConta(Integer idConta, Integer idUsuarioPagador, String descricao, Double valor) throws Exception{
        Conta conta = carregarConta(idConta);
        Usuario pagador = carregarUsuario(idUsuarioPagador);

        conta.setUsuarioByIdUsuarioPagador(pagador);
        conta.setDescricao(descricao);
        conta.setValor(valor);
        
        contaDAO.alterarConta(conta);
    }

    public void apagarConta(Integer idConta) {
        Conta conta = carregarConta(idConta);

        contaDAO.apagarConta(conta);
    }

    private Conta carregarConta(Integer idConta) {
        Conta conta = new Conta();
        conta.setIdConta(idConta);

        List<Conta> list = contaDAO.buscarConta(conta);

        if (list != null && list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }
    
    private Usuario carregarUsuario(Integer idUsuario) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        
        List<Usuario> listUsuario = usuarioDAO.buscarUsuario(usuario);
        
        if (listUsuario == null || listUsuario.size() != 1) {
            throw new Exception("Usuario inválido!");
            
        } else {
            usuario = listUsuario.get(0);
        }

        return usuario;
    }

}
