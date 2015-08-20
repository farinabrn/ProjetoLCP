/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.controller;

import java.util.List;
import rc.unesp.br.lcp.beans.Login;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.dao.LoginDAO;

/**
 *
 * @author guilherme
 */
public class LoginController {
  
  private LoginDAO loginDAO = new LoginDAO();
  
  public void adicionarLogin(Usuario usuario, String username, String senha) {
    Login login = new Login(usuario, username, senha);

    loginDAO.adicionarLogin(login);
  }

  public List<Login> buscarLogin(String username) {
      Login login = new Login(null, username, null);

      return loginDAO.buscarLogin(login);
  }

  public void alterarLogin(Integer idLogin, String username, String senha) {
      Login login = carregarLogin(idLogin, null);

      login.setUsername(username);
      login.setSenha(senha);

      loginDAO.alterarLogin(login);
 }

  public void apagarLogin(Integer id) {
      Login login = carregarLogin(id, null);

      loginDAO.apagarLogin(login);
  }

  public Login carregarLogin(Integer id, Integer idUsuario) {
      Login login = new Login();
      Usuario user = new Usuario();
      login.setId(id);
      user.setIdUsuario(idUsuario);
      login.setUser(user);
      

      List<Login> list = loginDAO.buscarLogin(login);

      if (list != null && list.size() == 1) {
          return list.get(0);
      } else {
          return null;
      }
  }
}
