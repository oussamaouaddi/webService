package dao;

import java.util.List;

import model.Clients;
import model.Pays;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class PaysImp implements IdaoPays {

	@Override
	public List<Pays> getallPays() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery(" select P.name from Pays  P");		
		List<Pays> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public List<Pays> getPaysbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery(" select P.name from Pays  P where id=?");
		query.setParameter(0,id);
		List<Pays> l1 =  query.list();
		tx.commit();
		session.close();	
		return l1;
	}

	@Override
	public void addPays(Pays c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deletePays(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Pays cl = (Pays) session.get(Pays.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updatePays(Pays c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
