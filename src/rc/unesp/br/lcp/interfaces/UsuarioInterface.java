/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.interfaces;

import java.util.List;
import rc.unesp.br.lcp.beans.UsuarioModel;

/**
 *
 * @author FARINA
 */
public interface UsuarioInterface {

    public void adicionarUsuario(UsuarioModel usuario);
    
    public List<UsuarioModel> buscaUsuarios();

    public UsuarioModel buscaUsuario(UsuarioModel usuario);

    public void alteraUsuario(UsuarioModel usuario);

    public void apagaUsuario(UsuarioModel usuario);
}
