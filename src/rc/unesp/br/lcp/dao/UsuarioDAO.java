/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rc.unesp.br.lcp.beans.UsuarioModel;
import rc.unesp.br.lcp.events.UsuarioEvent;
import rc.unesp.br.lcp.interfaces.UsuarioInterface;
import rc.unesp.br.lcp.listener.UsuarioListener;

/**
 *
 * @author FARINA
 */
public class UsuarioDAO implements UsuarioInterface {

    private List<UsuarioModel> usuarios;
    private List <UsuarioListener> usuarioListeners = new LinkedList();

    public UsuarioDAO() {
        this.usuarios = new ArrayList();
    }

    @Override
    public void adicionarUsuario(UsuarioModel usuario) {
        usuarios.add(usuario);
        this.disparaUsuarioNovo(usuario);
    }
    
    @Override
    public List<UsuarioModel> buscaUsuarios() {
        return this.usuarios;
    }

    @Override
    public UsuarioModel buscaUsuario(UsuarioModel usuario) {
        if (usuario != null) {
            return buscaUsuarioPorID(usuario.getId());
        }
        
        return null;
    }

    @Override
    public void alteraUsuario(UsuarioModel usuario) {
        usuarios.set(usuarios.indexOf(buscaUsuarioPorID(usuario.getId())), usuario);
    }

    @Override
    public void apagaUsuario(UsuarioModel usuario) {
        usuarios.remove(usuarios.indexOf(buscaUsuarioPorID(usuario.getId())));
    }

    private UsuarioModel buscaUsuarioPorID(Long idUsuario) {
        for (UsuarioModel usuario : usuarios) {
            if (usuario.getId() == idUsuario)
                return usuario;
        }
        
        return null;
    }
    
    public synchronized void addUsuarioListener(UsuarioListener listener) {
        if (!this.usuarioListeners.contains(listener)) {
            this.usuarioListeners.add(listener);
        }
    }
    
    private synchronized void disparaUsuarioNovo(UsuarioModel usuario) {
        for (UsuarioListener listener : usuarioListeners) {
            listener.usuarioNovo(new UsuarioEvent(usuario));
        }
    }
    
    private synchronized void disparaUsuarioApagado(UsuarioModel usuario) {
        for (UsuarioListener listener : usuarioListeners) {
            listener.usuarioApagado(new UsuarioEvent(usuario));
        }
    }
    
    private synchronized void disparaUsuarioAlterado(UsuarioModel usuario) {
        for (UsuarioListener listener : usuarioListeners) {
            listener.usuarioAlterado(new UsuarioEvent(usuario));
        }
    }
    
}
