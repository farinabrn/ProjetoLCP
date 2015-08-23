/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.beans;

public class Login {
  
  private Integer idLogin;
  private Usuario usuario;
  private String username;
  private String senha;

  public Login(){
    
  }
  
  public Login(Usuario usuario, String username, String senha){
    this.usuario = usuario;
    this.username = username;
    this.senha = senha;
  }
  
  public Integer getIdLogin() {
    return idLogin;
  }

  public void setIdLogin(Integer idLogin) {
    this.idLogin = idLogin;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
  
}
