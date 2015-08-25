/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.view;

import java.util.Arrays;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPasswordField;
import rc.unesp.br.lcp.beans.Login;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.controller.LoginController;
import rc.unesp.br.lcp.controller.UsuarioController;

/**
 *
 * @author guilherme
 */
public class LoginCadastro extends javax.swing.JFrame {

  private static UsuarioController usuarioController = new UsuarioController();
  private static LoginController loginController = new LoginController();
  private Integer idLogin;
  private Integer idUsuario;
  
  public LoginCadastro(Login login) {
    initComponents();
    
    if(login != null){
      comboUsuario.addItem(login.getUsuario().getNome());
      comboUsuario.setEnabled(false);
      textUsername.setText(login.getUsername());
      textSenha.setText(login.getSenha());
      setIdLogin(login.getIdLogin()); 
      setIdUsuario(login.getUsuario().getIdUsuario());
    }else{
      List<Usuario> usuarios = usuarioController.buscarUsuario(null, null, null, null);

      ComboBoxModel model = new DefaultComboBoxModel(usuarios.toArray());
      comboUsuario.setModel(model);
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    comboUsuario = new javax.swing.JComboBox();
    textUsername = new javax.swing.JTextField();
    textSenha = new javax.swing.JPasswordField();
    jPanel2 = new javax.swing.JPanel();
    buttonSair = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro - Login");

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setText("Username");

    jLabel2.setText("Senha");

    jLabel3.setText("Usuário");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addGap(6, 6, 6)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(0, 111, Short.MAX_VALUE))
          .addComponent(textSenha))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    buttonSair.setText("Sair");
    buttonSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSairActionPerformed(evt);
      }
    });

    buttonSalvar.setText("Salvar");
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonSalvarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(buttonSair, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(buttonSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    JPasswordField pf = new JPasswordField();
    if (getIdLogin() == null){  
      if ((JOptionPane.showConfirmDialog(null, pf, "Confirme sua senha:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION)){
        if(!Arrays.equals(pf.getPassword(), textSenha.getPassword()))
          JOptionPane.showMessageDialog(null, "Senha invalida!");
        else{
          List<Usuario> usuarios = usuarioController.buscarUsuario(null, comboUsuario.getSelectedItem().toString(), null, null);
          loginController.adicionarLogin(usuarios.get(0), textUsername.getText(), textSenha.getPassword().toString());
          JOptionPane.showMessageDialog(null, "Login salvo com sucesso!");
          textUsername.setText("");
          textSenha.setText("");
        }
      }
    }else{
      Login login = loginController.carregarLogin(getIdLogin());
       if ((JOptionPane.showConfirmDialog(null, pf, "Confirme sua senha antiga:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION)){
          String senha = new String(pf.getPassword());
          if(!senha.equals(login.getSenha())){
            JOptionPane.showMessageDialog(null, "Senha inválida!");
          }else if ((JOptionPane.showConfirmDialog(null, pf, "Confirme sua nova senha:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION)){
            if(!Arrays.equals(pf.getPassword(), textSenha.getPassword()))
              JOptionPane.showMessageDialog(null, "Senha invalida!"); 
          }else{
            loginController.alterarLogin(getIdLogin(), textUsername.getText(), textSenha.getPassword().toString());
        }
      }
    }
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
    dispose();
  }//GEN-LAST:event_buttonSairActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonSair;
  private javax.swing.JButton buttonSalvar;
  private javax.swing.JComboBox comboUsuario;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPasswordField textSenha;
  private javax.swing.JTextField textUsername;
  // End of variables declaration//GEN-END:variables

  /**
   * @return the idLogin
   */
  public Integer getIdLogin() {
    return idLogin;
  }

  /**
   * @param idLogin the idLogin to set
   */
  public void setIdLogin(Integer idLogin) {
    this.idLogin = idLogin;
  }

  /**
   * @return the idUsuario
   */
  public Integer getIdUsuario() {
    return idUsuario;
  }

  /**
   * @param idUsuario the idUsuario to set
   */
  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }
}
