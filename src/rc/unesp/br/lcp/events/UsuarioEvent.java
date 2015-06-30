/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.events;

import java.util.EventObject;
import rc.unesp.br.lcp.beans.UsuarioModel;

/**
 *
 * @author FARINA
 */
public class UsuarioEvent extends EventObject {

    public UsuarioEvent(UsuarioModel source) {
        super(source);
    }

    public UsuarioModel getUsuario() {
        return ((UsuarioModel) this.getSource());
    }
}
