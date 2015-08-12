/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import rc.unesp.br.lcp.beans.Usuario;


/**
 *
 * @author FARINA
 */
public class UsuarioDAO {
  
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void adicionarUsuario(Usuario usuario) {
        Transaction transaction = session.beginTransaction();
        session.save(usuario);
        transaction.commit();
    }
    
    public List<Usuario> buscarUsuario(Usuario usuario) {
        Criteria criteria = session.createCriteria(Usuario.class);
        
        if (usuario == null) {
            return criteria.list();
        }
        
        if (usuario.getIdUsuario() != null) {
            criteria.add(Restrictions.eq(Usuario.ID_USUARIO, usuario.getIdUsuario()));
        }

        if (usuario.getNome() != null && !usuario.getNome().equals("")) {
            criteria.add(Restrictions.like(Usuario.NOME, usuario.getNome(), MatchMode.ANYWHERE));
        }
        
        if (usuario.getApelido() != null && !usuario.getApelido().equals("")) {
            criteria.add(Restrictions.like(Usuario.APELIDO, usuario.getApelido(), MatchMode.ANYWHERE));
        }
        
        if (usuario.getCpf() != null && !usuario.getCpf().equals("")) {
            criteria.add(Restrictions.like(Usuario.CPF, usuario.getNome(), MatchMode.ANYWHERE));
        }

        List<Usuario> list = criteria.list();
        return list;
    }

    public void alterarUsuario(Usuario usuario) {
        Transaction transaction = session.beginTransaction();
        session.merge(usuario);
        transaction.commit();
    }

    public void apagarUsuario(Usuario usuario) {
        Transaction transaction = session.beginTransaction();
        session.delete(usuario);
        transaction.commit();
    }
}
