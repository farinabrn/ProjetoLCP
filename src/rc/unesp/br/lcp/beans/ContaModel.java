/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rc.unesp.br.lcp.beans;

/**
 *
 * @author FARINA
 */
public class ContaModel {

    private String descricao;
    private Double valor;

    public ContaModel(String descricao, Double preco) {
        this.descricao = descricao;
        this.valor = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
