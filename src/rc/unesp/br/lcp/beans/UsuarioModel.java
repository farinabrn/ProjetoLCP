/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.beans;

import java.sql.Timestamp;

/**
 *
 * @author FARINA
 */
public class UsuarioModel {
    
    private long id;
    private String nome;
    private String apelido;
    private String cpf;
    private Timestamp dataInicio;
    private Timestamp dataTermino;
    private SituacaoUsuarioModel situacaoUsuario;
    private String telefoneCelular;
    private String telefoneResidencial;
    private String email;
    private ContaBancariaModel contaBancaria;

    public UsuarioModel(long id, String nome, String apelido, String cpf, Timestamp dataInicio, Timestamp dataTermino, SituacaoUsuarioModel situacaoUsuario, String telefoneCelular, String telefoneResidencial, String email, ContaBancariaModel contaBancaria) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.situacaoUsuario = situacaoUsuario;
        this.telefoneCelular = telefoneCelular;
        this.telefoneResidencial = telefoneResidencial;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Timestamp dataTermino) {
        this.dataTermino = dataTermino;
    }

    public SituacaoUsuarioModel getSituacaoUsuario() {
        return situacaoUsuario;
    }

    public void setSituacaoUsuario(SituacaoUsuarioModel situacaoUsuario) {
        this.situacaoUsuario = situacaoUsuario;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }
    
    public String getEmail() {
      return email;
    }
    
    public void setEmail(String email) {
      this.email = email;
    }

    public ContaBancariaModel getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancariaModel contaBancaria) {
        this.contaBancaria = contaBancaria;
    }    
}
