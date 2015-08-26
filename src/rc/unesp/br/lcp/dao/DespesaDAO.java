/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import rc.unesp.br.lcp.beans.Despesa;

/**
 *
 * @author FARINA
 */
public class DespesaDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void adicionarDespesa(Despesa despesa) {
        Transaction transaction = session.beginTransaction();
        session.save(despesa);
        transaction.commit();
    }

    public List<Despesa> buscarDespesa(Despesa despesa) {
        Criteria criteria = session.createCriteria(Despesa.class);

        if (despesa == null) {
            return criteria.list();
        }

        if (despesa.getIdDespesa() != null && despesa.getIdDespesa() != 0) {
            criteria.add(Restrictions.eq(Despesa.ID_DESPESA, despesa.getIdDespesa()));
        }

        if (despesa.getUsuarioPagador() != null && despesa.getUsuarioPagador().getIdUsuario() != null) {
            criteria.add(Restrictions.eq(Despesa.ID_USUARIO, despesa.getUsuarioPagador()));
        }

        if (despesa.getDescricao() != null && !despesa.getDescricao().equals("")) {
            criteria.add(Restrictions.like(Despesa.DESCRICAO, despesa.getDescricao(), MatchMode.ANYWHERE));
        }

        if (despesa.getPreco() != null && despesa.getPreco() != 0) {
            criteria.add(Restrictions.eq(Despesa.PRECO, despesa.getPreco()));
        }
        
        if (despesa.isPago()){
            criteria.add(Restrictions.eq(Despesa.PAGO, despesa.isPago()));
        }

        List<Despesa> list = criteria.list();

        return list;
    }

    public void alterarDespesa(Despesa despesa) {
        Transaction transaction = session.beginTransaction();
        session.merge(despesa);
        transaction.commit();
    }

    public void apagarDespesa(Despesa despesa) {
        Transaction transaction = session.beginTransaction();
        session.delete(despesa);
        transaction.commit();
    }
}
