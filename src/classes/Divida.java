/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author FARINA
 */
public class Divida {

    private Usuario devedor;
    private Usuario recebedor;
    private String descricao;
    private Double preco;

    public Usuario getDevedor() {
        return devedor;
    }

    public void setDevedor(Usuario devedor) {
        this.devedor = devedor;
    }

    public Usuario getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(Usuario recebedor) {
        this.recebedor = recebedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
