package rc.unesp.br.lcp.beans;
// Generated 27/07/2015 23:54:14 by Hibernate Tools 4.3.1

/**
 * Conta generated by hbm2java
 */
public class Conta implements java.io.Serializable {

    public static final String ID_CONTA = "idConta";
    public static final String ID_USUARIO = "usuario";
    public static final String DESCRICAO = "descricao";
    public static final String TIPO_CONTA = "tipoConta";

    private Integer idConta;
    private Usuario usuarioByIdUsuarioPagador;
    private String descricao;
    private Double valor;
    private Integer tipoConta;

    public Conta() {
    }

    public Conta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Conta(Integer idConta, Usuario usuarioByIdUsuarioPagador, String descricao, Double valor, Integer tipoConta) {
        this.idConta = idConta;
        this.usuarioByIdUsuarioPagador = usuarioByIdUsuarioPagador;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoConta = tipoConta;
    }

    public Integer getIdConta() {
        return this.idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Usuario getUsuarioByIdUsuarioPagador() {
        return this.usuarioByIdUsuarioPagador;
    }

    public void setUsuarioByIdUsuarioPagador(Usuario usuarioByIdUsuarioPagador) {
        this.usuarioByIdUsuarioPagador = usuarioByIdUsuarioPagador;
    }

}