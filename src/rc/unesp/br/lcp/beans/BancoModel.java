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
public class BancoModel {
    
    private String descricao;

    
    public BancoModel(String descricao) {
        this.descricao = descricao;
    }

    public BancoModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
