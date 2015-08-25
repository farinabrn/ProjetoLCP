/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.beans;

/**
 *
 * @author guilherme
 */
public class DadosLogin {
  
  private Login login;
  private static DadosLogin INSTANCE = new DadosLogin();

  public static Login login() {
    return INSTANCE.getLogin();
  }

  public static void createLogin(Login aLogin) {
    INSTANCE.setLogin(aLogin);
  }
  
  public void setLogin(Login aLogin){
    this.login = aLogin;
  }

  public Login getLogin(){
    return this.login;
  }
  public static DadosLogin getINSTANCE() {
    return INSTANCE;
  }

  public static void setINSTANCE(DadosLogin aINSTANCE) {
    INSTANCE = aINSTANCE;
  }
}