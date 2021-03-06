package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Teacher;
import util.HibernateUtil;

public class TeacherDaoImpl extends HibernateUtil implements TeacherDao {

	SessionFactory sessionFactory = getSessionFactory();

	public void addTeacher(Teacher teacher) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(teacher);
		transaction.commit();
		session.close();
	}

	public void updateTeacher(Teacher teacher) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.merge(teacher);
		transaction.commit();
		session.close();
	}

	public void deleteTeacher(Teacher teacher) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.delete(teacher);
		transaction.commit();
		session.close();
	}

	public Teacher getTeacherById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Teacher teacher = session.get(Teacher.class, id);
		transaction.commit();
		session.close();
		return teacher;
	}

	public Teacher getTeacherByFullName(String lastName, String name, String surname) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Teacher teacher = session.createQuery("from Teacher where lastName = '" + lastName + "' AND name = '" + name
				+ "' AND surname = '" + surname + "'", Teacher.class).getSingleResult();
		transaction.commit();
		session.close();
		return teacher;
	}

	public List<Teacher> getAllTeachers() {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Teacher> teachers = session.createQuery("from Teacher", Teacher.class).getResultList();
		transaction.commit();
		session.close();
		return teachers;
	}
	
}
