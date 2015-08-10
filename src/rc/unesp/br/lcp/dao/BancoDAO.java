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
import rc.unesp.br.lcp.beans.Banco;

/**
 *
 * @author FARINA
 */
public class BancoDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void adicionarBanco(Banco banco) {
        Transaction transaction = session.beginTransaction();
        session.save(banco);
        transaction.commit();
    }

    public List<Banco> buscarBanco(Banco banco) {
        Criteria criteria = session.createCriteria(Banco.class);
        
        if (banco == null) {
            return criteria.list();
        }
        
        if (banco.getIdBanco() != null) {
                criteria.add(Restrictions.eq(Banco.ID_BANCO, banco.getIdBanco()));
        }

        if (banco.getDescricao() != null && !banco.getDescricao().equals("")) {
            criteria.add(Restrictions.like(Banco.DESCRICAO, banco.getDescricao(), MatchMode.ANYWHERE));
        }

        List<Banco> list = criteria.list();
        return list;
    }

    public void alterarBanco(Banco banco) {
        Transaction transaction = session.beginTransaction();
        session.merge(banco);
        transaction.commit();
    }

    public void apagarBanco(Banco banco) {
        Transaction transaction = session.beginTransaction();
        session.delete(banco);
        transaction.commit();
    }
}
