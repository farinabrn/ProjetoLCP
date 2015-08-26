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
import rc.unesp.br.lcp.beans.Conta;

/**
 *
 * @author FARINA
 */
public class ContaDAO {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void adicionarConta(Conta conta) {
        Transaction transaction = session.beginTransaction();
        session.save(conta);
        transaction.commit();
    }

    public List<Conta> buscarConta(Conta conta) {
        Criteria criteria = session.createCriteria(Conta.class);
        
        if (conta == null) {
            return criteria.list();
        }
        
        if (conta.getIdConta() != null) {
            criteria.add(Restrictions.eq(Conta.ID_CONTA, conta.getIdConta()));
        }
        
        if (conta.getUsuarioByIdUsuarioPagador() != null) {
            criteria.add(Restrictions.eq(Conta.ID_USUARIO, conta.getUsuarioByIdUsuarioPagador()));
        }

        if (conta.getDescricao() != null && !conta.getDescricao().equals("")) {
            criteria.add(Restrictions.like(Conta.DESCRICAO, conta.getDescricao(), MatchMode.ANYWHERE));
        }

        if (conta.getValor() != null) {
            criteria.add(Restrictions.eq(Conta.VALOR, conta.getValor()));
        }
         
        if (conta.getPago() != null) {
            criteria.add(Restrictions.eq(Conta.PAGO, conta.getPago()));
        }
        
        List<Conta> list = criteria.list();
        return list;
    }
    
    public void alterarConta(Conta conta) {
        Transaction transaction = session.beginTransaction();
        session.merge(conta);
        transaction.commit();
    }

    public void apagarConta(Conta conta) {
        Transaction transaction = session.beginTransaction();
        session.delete(conta);
        transaction.commit();
    }
}
