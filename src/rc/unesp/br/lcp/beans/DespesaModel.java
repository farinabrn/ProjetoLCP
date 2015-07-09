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

    private UsuarioModel pagador;

    public DespesaModel(UsuarioModel comprador, String descricao, Double preco) {
        super(descricao, preco);
        this.pagador = comprador;
    }
    
    public UsuarioModel getPagador() {
        return pagador;
    }

    public void setPagador(UsuarioModel pagador) {
        this.pagador = pagador;
    }
}
