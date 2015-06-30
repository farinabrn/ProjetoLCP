/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.listener;

import java.util.EventListener;
import rc.unesp.br.lcp.events.UsuarioEvent;

/**
 *
 * @author FARINA
 */
public interface UsuarioListener extends EventListener {
    
    public void usuarioNovo(UsuarioEvent event);
    public void usuarioApagado(UsuarioEvent event);
    public void usuarioAlterado(UsuarioEvent event);
}
