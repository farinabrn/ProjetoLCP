/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.main;

import java.applet.Applet;
import rc.unesp.br.lcp.dao.UsuarioDAO;

/**
 *
 * @author FARINA
 */
public class Planilha extends Applet {

    public static void main(String[] args) {
        Planilha p = new Planilha();
        p.start();
    }

    @Override
    public void start() {
        UsuarioDAO usuario = new UsuarioDAO();
    }
}
