package rc.unesp.br.lcp.beans;
// Generated 27/07/2015 23:54:14 by Hibernate Tools 4.3.1

/**
 * Divida generated by hbm2java
 */
public class Divida implements java.io.Serializable {

    public static final String ID_DIVIDA = "idDivida";
    public static final String DESCRICAO = "descricao";
    public static final String PRECO = "preco";
    public static final String ID_USUARIO = "usuario";

    private Integer idDivida;
    private Usuario usuarioByIdUsuarioDevedor;
    private Usuario usuarioByIdUsuarioRecebedor;
    private String descricao;
    private Double preco;

    public Divida() {
    }

    public Divida(Integer idDivida, Usuario usuarioByIdUsuarioDevedor, Usuario usuarioByIdUsuarioRecebedor, String descricao, Double preco) {
        this.idDivida = idDivida;
        this.usuarioByIdUsuarioDevedor = usuarioByIdUsuarioDevedor;
        this.usuarioByIdUsuarioRecebedor = usuarioByIdUsuarioRecebedor;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getIdDivida() {
        return this.idDivida;
    }

    public void setIdDivida(Integer idDivida) {
        this.idDivida = idDivida;
    }

    public Usuario getUsuarioByIdUsuarioDevedor() {
        return this.usuarioByIdUsuarioDevedor;
    }

    public void setUsuarioByIdUsuarioDevedor(Usuario usuarioByIdUsuarioDevedor) {
        this.usuarioByIdUsuarioDevedor = usuarioByIdUsuarioDevedor;
    }

    public Usuario getUsuarioByIdUsuarioRecebedor() {
        return this.usuarioByIdUsuarioRecebedor;
    }

    public void setUsuarioByIdUsuarioRecebedor(Usuario usuarioByIdUsuarioRecebedor) {
        this.usuarioByIdUsuarioRecebedor = usuarioByIdUsuarioRecebedor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}