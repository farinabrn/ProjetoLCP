package rc.unesp.br.lcp.beans;
// Generated 27/07/2015 23:54:14 by Hibernate Tools 4.3.1

/**
 * Banco generated by hbm2java
 */
public class Banco implements java.io.Serializable {

    public static final String ID_BANCO = "idBanco";
    public static final String DESCRICAO = "descricao";

    private Integer idBanco;
    private String descricao;
    

    public Banco() {
    }

    public Banco(Integer idBanco, String descricao) {
        this.idBanco = idBanco;
        this.descricao = descricao;
    }

    public Integer getIdBanco() {
        return this.idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
      return this.getDescricao(); //To change body of generated methods, choose Tools | Templates.
    }
}
