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
  
  private static String userName;
  private static Integer idUsuario;

  /**
   * @return the userName
   */
  public static String getUserName() {
    return userName;
  }

  /**
   * @param aUserName the userName to set
   */
  public static void setUserName(String aUserName) {
    userName = aUserName;
  }

  /**
   * @return the idUsuario
   */
  public static Integer getIdUsuario() {
    return idUsuario;
  }

  /**
   * @param aIdUsuario the idUsuario to set
   */
  public static void setIdUsuario(Integer aIdUsuario) {
    idUsuario = aIdUsuario;
  }
}
