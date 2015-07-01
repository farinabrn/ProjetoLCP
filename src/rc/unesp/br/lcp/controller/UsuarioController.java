/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class UsuarioController implements ActionListener{

    private UsuarioDAO usuarioDAO;
    
    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
//        usuarioDAO.adicionarUsuario();
    }
    
}
