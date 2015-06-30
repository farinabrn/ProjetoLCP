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
public class DividaModel {

    private UsuarioModel devedor;
    private UsuarioModel recebedor;
    private String descricao;
    private Double preco;

    public DividaModel(UsuarioModel devedor, UsuarioModel recebedor, String descricao, Double preco) {
        this.devedor = devedor;
        this.recebedor = recebedor;
        this.descricao = descricao;
        this.preco = preco;
    }

    public UsuarioModel getDevedor() {
        return devedor;
    }

    public void setDevedor(UsuarioModel devedor) {
        this.devedor = devedor;
    }

    public UsuarioModel getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(UsuarioModel recebedor) {
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
