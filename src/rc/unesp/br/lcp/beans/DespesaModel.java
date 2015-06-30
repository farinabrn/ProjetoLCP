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
public class DespesaModel extends ContaModel {

    private UsuarioModel comprador;

    public DespesaModel(UsuarioModel comprador, String descricao, Double preco) {
        super(descricao, preco);
        this.comprador = comprador;
    }
    
    public UsuarioModel getComprador() {
        return comprador;
    }

    public void setComprador(UsuarioModel comprador) {
        this.comprador = comprador;
    }
}
