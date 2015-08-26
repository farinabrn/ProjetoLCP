/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.view;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rc.unesp.br.lcp.beans.Banco;
import rc.unesp.br.lcp.beans.ContaBancaria;
import rc.unesp.br.lcp.beans.Usuario;
import rc.unesp.br.lcp.controller.BancoController;
import rc.unesp.br.lcp.controller.UsuarioController;

/**
 *
 * @author Guizão
 */
public class UsuarioCadastro extends JFrame {

    private static UsuarioController usuarioController = new UsuarioController();
    private static BancoController bancoController = new BancoController();
    private Integer idUsuario;
 
  public UsuarioCadastro(Usuario usuario) {
      initComponents();
      
      List<Banco> bancos = bancoController.buscarBanco(null, null);
      
      ComboBoxModel model = new DefaultComboBoxModel(bancos.toArray());
      comboBoxBanco.setModel(model);

      if (usuario != null){
        setIdUsuario(usuario.getIdUsuario());
        textNome.setText(usuario.getNome());
        textApelido.setText(usuario.getApelido());
        textCPF.setText(usuario.getCpf());
        textEmail.setText(usuario.getEmail());
        comboBoxSituacao.setSelectedIndex(usuario.getSituacaoUsuario());
        textDataInicio.setText(usuario.getDataInicio().toString());
        textDataTermino.setText(usuario.getDataTermino().toString());
        textTelefoneRes.setText(usuario.getTelefoneResidencial());
        textTelefoneCel.setText(usuario.getTelefoneCelular());
        comboBoxBanco.setSelectedItem(usuario.getContabancaria().getBanco().getDescricao());
        textAgencia.setText(usuario.getContabancaria().getAgencia());
        textConta.setText(usuario.getContabancaria().getConta());
      }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel9 = new javax.swing.JLabel();
    panelIdentificacao = new javax.swing.JPanel();
    buttonSair = new javax.swing.JButton();
    buttonSalvar = new javax.swing.JButton();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    panelDados = new javax.swing.JPanel();
    labelNome = new javax.swing.JLabel();
    textNome = new javax.swing.JTextField();
    labelApelido = new javax.swing.JLabel();
    textApelido = new javax.swing.JTextField();
    labelCPF = new javax.swing.JLabel();
    labelDataInicio = new javax.swing.JLabel();
    textDataInicio = new javax.swing.JTextField();
    try{
      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");
      textDataInicio= new javax.swing.JFormattedTextField(data);
    }
    catch (Exception e){
    }
    labelDataTermino = new javax.swing.JLabel();
    textDataTermino = new javax.swing.JTextField();
    try{
      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");
      textDataTermino= new javax.swing.JFormattedTextField(data);
    }
    catch (Exception e){
    }
    labelSituacao = new javax.swing.JLabel();
    comboBoxSituacao = new javax.swing.JComboBox();
    labelTelefoneRes = new javax.swing.JLabel();
    textTelefoneRes = new javax.swing.JTextField();
    try{
      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) ####-####");
      textTelefoneRes = new javax.swing.JFormattedTextField(data);
    }
    catch (Exception e){
    }
    labelTelefoneCel = new javax.swing.JLabel();
    textTelefoneCel = new javax.swing.JTextField();
    try{
      javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##) #####-####");
      textTelefoneCel = new javax.swing.JFormattedTextField(data);
    }
    catch (Exception e){
    }
    labelEmail = new javax.swing.JLabel();
    textEmail = new javax.swing.JTextField();
    panelDadosBancarios = new javax.swing.JPanel();
    comboBoxBanco = new javax.swing.JComboBox();
    textAgencia = new javax.swing.JTextField();
    labelBanco = new javax.swing.JLabel();
    labelAgencia = new javax.swing.JLabel();
    labelConta = new javax.swing.JLabel();
    textConta = new javax.swing.JTextField();
    textCPF = new javax.swing.JFormattedTextField();
    try{
      javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("###.###.###-##");
      textCPF = new javax.swing.JFormattedTextField(data);
    }
    catch (Exception e){
    }

    jLabel9.setText("jLabel9");

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro - Usuário");

    panelIdentificacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    buttonSair.setText("Sair");
    buttonSair.setPreferredSize(new java.awt.Dimension(63, 23));
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

    labelNome.setText("Nome:");

    labelApelido.setText("Apelido:");

    labelCPF.setText("CPF");

    labelDataInicio.setText("Data de início");

    labelDataTermino.setText("Data de término");

    labelSituacao.setText("Situação");

    comboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
    comboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboBoxSituacaoActionPerformed(evt);
      }
    });

    labelTelefoneRes.setText("Telefone (residencial):");

    labelTelefoneCel.setText("Telefone (celular):");

    labelEmail.setText("Email:");

    panelDadosBancarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Bancários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

    comboBoxBanco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    labelBanco.setText("Banco:");

    labelAgencia.setText("Agência:");

    labelConta.setText("Conta:");

    javax.swing.GroupLayout panelDadosBancariosLayout = new javax.swing.GroupLayout(panelDadosBancarios);
    panelDadosBancarios.setLayout(panelDadosBancariosLayout);
    panelDadosBancariosLayout.setHorizontalGroup(
      panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosBancariosLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(labelBanco)
          .addComponent(labelAgencia)
          .addComponent(labelConta))
        .addGap(69, 69, 69)
        .addGroup(panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(textConta)
          .addComponent(textAgencia)
          .addComponent(comboBoxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    panelDadosBancariosLayout.setVerticalGroup(
      panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosBancariosLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelBanco)
          .addComponent(comboBoxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelAgencia)
          .addComponent(textAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelConta)
          .addComponent(textConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
    panelDados.setLayout(panelDadosLayout);
    panelDadosLayout.setHorizontalGroup(
      panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(textNome)
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(labelEmail)
              .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
              .addComponent(textApelido))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(comboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(panelDadosLayout.createSequentialGroup()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(labelSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(labelCPF))
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(textCPF)))
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(textDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelApelido)
              .addComponent(labelNome)
              .addComponent(labelDataInicio)
              .addComponent(textTelefoneRes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelTelefoneRes))
            .addGap(36, 36, 36)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(textTelefoneCel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(labelDataTermino)
              .addComponent(labelTelefoneCel)
              .addComponent(textDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addComponent(panelDadosBancarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    panelDadosLayout.setVerticalGroup(
      panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDadosLayout.createSequentialGroup()
        .addComponent(labelNome)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelApelido)
          .addComponent(labelCPF))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(textApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(labelEmail)
          .addComponent(labelSituacao))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(comboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(panelDadosBancarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panelDadosLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(labelDataInicio)
              .addComponent(labelDataTermino))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(textDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(textDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(labelTelefoneRes)
              .addComponent(labelTelefoneCel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(textTelefoneCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(textTelefoneRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap())
    );

    jTabbedPane1.addTab("Dados", panelDados);

    javax.swing.GroupLayout panelIdentificacaoLayout = new javax.swing.GroupLayout(panelIdentificacao);
    panelIdentificacao.setLayout(panelIdentificacaoLayout);
    panelIdentificacaoLayout.setHorizontalGroup(
      panelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdentificacaoLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(buttonSalvar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    panelIdentificacaoLayout.setVerticalGroup(
      panelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelIdentificacaoLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(buttonSalvar)
          .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(panelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(panelIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
    SimpleDateFormat formatter = new  SimpleDateFormat("dd/MM/yy");
    Banco banco = (Banco)comboBoxBanco.getSelectedItem();
    ContaBancaria contaBancaria = new ContaBancaria(null, banco, textAgencia.getText(), textConta.getText());
    if (this.idUsuario == null){
      try {
        usuarioController.adicionarUsuario(null, contaBancaria, textNome.getText(), textApelido.getText(),
                textCPF.getText(), (Date)formatter.parse(textDataInicio.getText()), (Date)formatter.parse(textDataTermino.getText()),
                comboBoxSituacao.getSelectedIndex(), textTelefoneCel.getText(), textTelefoneRes.getText(), textEmail.getText());
      } catch (ParseException ex) {
          Logger.getLogger(UsuarioCadastro.class.getName()).log(Level.SEVERE, null, ex);
      } catch(Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Erro ao inserir");
          return;
      }
      JOptionPane.showMessageDialog(null, "Sucesso na inserção");
    }else{
      Usuario usuario = usuarioController.carregarUsuario(this.idUsuario);
      try {
        usuarioController.alterarUsuario(this.idUsuario, contaBancaria, textNome.getText(), textApelido.getText(),
                textCPF.getText(), (Date)formatter.parse(textDataInicio.getText()), (Date)formatter.parse(textDataTermino.getText()),
                comboBoxSituacao.getSelectedIndex(), textTelefoneCel.getText(), textTelefoneRes.getText(), textEmail.getText());
      } catch (ParseException ex) {
        Logger.getLogger(UsuarioCadastro.class.getName()).log(Level.SEVERE, null, ex);
      } catch(Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Erro ao editar");
          return;
      }
      JOptionPane.showMessageDialog(null, "Sucesso na edição");
    }
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
    dispose();
  }//GEN-LAST:event_buttonSairActionPerformed

  private void comboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSituacaoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_comboBoxSituacaoActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonSair;
  private javax.swing.JButton buttonSalvar;
  private javax.swing.JComboBox comboBoxBanco;
  private javax.swing.JComboBox comboBoxSituacao;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JLabel labelAgencia;
  private javax.swing.JLabel labelApelido;
  private javax.swing.JLabel labelBanco;
  private javax.swing.JLabel labelCPF;
  private javax.swing.JLabel labelConta;
  private javax.swing.JLabel labelDataInicio;
  private javax.swing.JLabel labelDataTermino;
  private javax.swing.JLabel labelEmail;
  private javax.swing.JLabel labelNome;
  private javax.swing.JLabel labelSituacao;
  private javax.swing.JLabel labelTelefoneCel;
  private javax.swing.JLabel labelTelefoneRes;
  private javax.swing.JPanel panelDados;
  private javax.swing.JPanel panelDadosBancarios;
  private javax.swing.JPanel panelIdentificacao;
  private javax.swing.JTextField textAgencia;
  private javax.swing.JTextField textApelido;
  private javax.swing.JFormattedTextField textCPF;
  private javax.swing.JTextField textConta;
  private javax.swing.JTextField textDataInicio;
  private javax.swing.JTextField textDataTermino;
  private javax.swing.JTextField textEmail;
  private javax.swing.JTextField textNome;
  private javax.swing.JTextField textTelefoneCel;
  private javax.swing.JTextField textTelefoneRes;
  // End of variables declaration//GEN-END:variables

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }
}
