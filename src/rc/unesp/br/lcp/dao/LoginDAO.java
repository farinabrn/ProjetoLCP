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
import rc.unesp.br.lcp.beans.Login;

/**
 *
 * @author guilherme
 */
public class LoginDAO {
  
  Session session = HibernateUtil.getSessionFactory().openSession();
  
  public void adicionarLogin(Login login) {
        Transaction transaction = session.beginTransaction();
        session.save(login);
        transaction.commit();
    }

    public List<Login> buscarLogin(Login login) {
        Criteria criteria = session.createCriteria(Login.class);
        
        if (login == null) {
          return criteria.list();
        }
        
        if (login.getIdLogin() != null){
          criteria.add(Restrictions.eq("id", login.getIdLogin()));
        }
        
        if (login.getIdUsuario() != null){
          criteria.add(Restrictions.eq("idUsuario", login.getIdUsuario()));
        }
        
        if (login.getUsername() != null && !login.getUsername().equals("")) {
          criteria.add(Restrictions.like("username", login.getUsername(), MatchMode.ANYWHERE));
        }

        if (login.getSenha() != null && !login.getSenha().equals("")) {
            criteria.add(Restrictions.like("senha", login.getSenha(), MatchMode.ANYWHERE));
        }

        List<Login> list = criteria.list();
        return list;
    }

    public void alterarLogin(Login login) {
        Transaction transaction = session.beginTransaction();
        session.merge(login);
        transaction.commit();
    }

    public void apagarLogin(Login login) {
        Transaction transaction = session.beginTransaction();
        session.delete(login);
        transaction.commit();
    }
    
}
