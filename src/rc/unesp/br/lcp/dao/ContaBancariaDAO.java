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
import rc.unesp.br.lcp.beans.ContaBancaria;

/**
 *
 * @author FARINA
 */
public class ContaBancariaDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();
   
    public void adicionarContaBancaria(ContaBancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.save(contaBancaria);
        transaction.commit();
    }

    public List<ContaBancaria> buscarContaBancaria(ContaBancaria contaBancaria) {
        Criteria criteria = session.createCriteria(ContaBancaria.class);
        
        if (contaBancaria == null) {
            return criteria.list();
        }
        
        if (contaBancaria.getIdContaBancaria() != null) {
            criteria.add(Restrictions.eq(ContaBancaria.ID_CONTA, contaBancaria.getIdContaBancaria()));
        }

        List<ContaBancaria> list = criteria.list();
        return list;
    }

    public void alterarContaBancaria(ContaBancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.merge(contaBancaria);
        transaction.commit();
    }

    public void apagarContaBancaria(ContaBancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.delete(contaBancaria);
        transaction.commit();
    }
}
