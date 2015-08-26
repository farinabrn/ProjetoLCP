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
import rc.unesp.br.lcp.beans.Divida;

/**
 *
 * @author FARINA
 */
public class DividaDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void adicionarDivida(Divida divida) {
        Transaction transaction = session.beginTransaction();
        session.save(divida);
        transaction.commit();
    }

    public List<Divida> buscarDivida(Divida divida) {
        Criteria criteria = session.createCriteria(Divida.class);

        if (divida == null) {
            return criteria.list();
        }

        if (divida.getIdDivida()!= null && divida.getIdDivida() != 0) {
            criteria.add(Restrictions.eq(Divida.ID_DIVIDA, divida.getIdDivida()));
        }

        if (divida.getDescricao() != null && !divida.getDescricao().equals("")) {
            criteria.add(Restrictions.like(Divida.DESCRICAO, divida.getDescricao(), MatchMode.ANYWHERE));
        }

        if (divida.getPreco() != null && divida.getPreco() != 0) {
            criteria.add(Restrictions.eq(Divida.PRECO, divida.getPreco()));
        }
        
        if (divida.getPago() != null){
            criteria.add(Restrictions.eq(Divida.PAGO, true));
        }

        List<Divida> list = criteria.list();

        return list;
    }

    public void alterarDivida(Divida divida) {
        Transaction transaction = session.beginTransaction();
        session.merge(divida);
        transaction.commit();
    }

    public void apagarDivida(Divida divida) {
        Transaction transaction = session.beginTransaction();
        session.delete(divida);
        transaction.commit();
    }
}
