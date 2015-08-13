/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.main;

import java.applet.Applet;
import java.util.List;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.UsuarioDAO;
import rc.unesp.br.lcp.view.Principal;

/**
 *
 * @author FARINA
 */
public class Planilha extends Applet {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
        
    }

    @Override
    public void start() {
        
    }
}
