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
import rc.unesp.br.lcp.beans.Contabancaria;

/**
 *
 * @author FARINA
 */
public class ContaBancariaDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();
   
    public void adicionarContaBancaria(Contabancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.save(contaBancaria);
        transaction.commit();
    }

    public List<Contabancaria> buscarContaBancaria(Contabancaria contaBancaria) {
        Criteria criteria = session.createCriteria(Contabancaria.class);
        
        if (contaBancaria == null) {
            return criteria.list();
        }
        
        if (contaBancaria.getIdContaBancaria() != null) {
            criteria.add(Restrictions.eq(Contabancaria.ID_CONTA, contaBancaria.getIdContaBancaria()));
        }

        if (contaBancaria.getIdBanco() != null && !contaBancaria.getIdBanco().equals("")) {
            criteria.add(Restrictions.like(Contabancaria.ID_BANCO, contaBancaria.getIdBanco().toString(), MatchMode.ANYWHERE));
        }

        List<Contabancaria> list = criteria.list();
        return list;
    }

    public void alterarContaBancaria(Contabancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.merge(contaBancaria);
        transaction.commit();
    }

    public void apagarContaBancaria(Contabancaria contaBancaria) {
        Transaction transaction = session.beginTransaction();
        session.delete(contaBancaria);
        transaction.commit();
    }
}
