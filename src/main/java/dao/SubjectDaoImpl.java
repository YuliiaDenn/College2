package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Subject;
import util.HibernateUtil;

public class SubjectDaoImpl extends HibernateUtil implements SubjectDao {

	private SessionFactory sessionFactory = getSessionFactory();

	public void addSubject(Subject subject) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(subject);
		transaction.commit();
		session.close();
	}

	public void updateSubject(Subject subject) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.merge(subject);
		transaction.commit();
		session.close();
	}

	public void deleteSubject(Subject subject) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.delete(subject);
		transaction.commit();
		session.close();
	}

	public Subject getSubjectById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.get(Subject.class, id);
		transaction.commit();
		session.close();
		return subject;
	}

	public Subject getSubjectByName(String name) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.get(Subject.class, name);
		transaction.commit();
		session.close();
		return subject;
	}

	public List<Subject> getAllSubjects() {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Subject> subjects = session.createQuery("from Subject", Subject.class).getResultList();
		transaction.commit();
		session.close();
		return subjects;
	}
}
