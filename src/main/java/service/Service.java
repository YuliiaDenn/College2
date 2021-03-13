package service;

import java.util.List;

import dao.SubjectDao;
import dao.SubjectDaoImpl;
import dao.TeacherDao;
import dao.TeacherDaoImpl;
import entity.Subject;
import entity.Teacher;

public class Service {

	TeacherDao teacherDao = new TeacherDaoImpl();
	SubjectDao subjectDao = new SubjectDaoImpl();

	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	public void updateTeacher(Teacher teacher) {
		if (teacher != null) {
			teacherDao.updateTeacher(teacher);
		}
	}

	public void deleteTeacher(int id) {
		Teacher teacher = teacherDao.getTeacherById(id);
		if (teacher != null) {
			teacherDao.deleteTeacher(teacher);
		}
	}

	public Teacher getTeacherByID(int id) {
		return teacherDao.getTeacherById(id);
	}

	public Teacher getTeacherByFullName(String lastName, String name, String surname) {
		return teacherDao.getTeacherByFullName(lastName, name, surname);
	}

	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}

	public void showTeacherWithSubjectsById(int id) {
		Teacher teacher = teacherDao.getTeacherById(id);
		System.out.println("Teacher: [" + teacher.getId() + "] - " + teacher.getLastName() + " " + teacher.getName()
				+ " " + teacher.getSurname());
		teacher.getSubjects().forEach(System.out::println);

		System.out.println();
	}

	public void showTeacherWithSubjectsByFullName(String lastName, String name, String surname) {
		Teacher teacher = teacherDao.getTeacherByFullName(lastName, name, surname);
		System.out.println("Teacher: [" + teacher.getId() + "] - " + teacher.getLastName() + " " + teacher.getName()
				+ " " + teacher.getSurname());
		teacher.getSubjects().forEach(System.out::println);

		System.out.println();
	}

	public void showAllTeachersWithSubjects() {
		System.out.println("TEACHERS:");
		teacherDao.getAllTeachers().forEach(teachers -> {
			System.out.println("Teacher: [" + teachers.getId() + "] - " + teachers.getLastName() + " "
					+ teachers.getName() + " " + teachers.getSurname());
			teachers.getSubjects().forEach(System.out::println);
		});
		System.out.println();
	}

	public void addSubject(Subject subject) {
		subjectDao.addSubject(subject);
	}

	public void updateSubject(Subject subject) {
		if (subject != null) {
			subjectDao.updateSubject(subject);
		}
	}

	public void deleteSubject(int id) {
		Subject subject = subjectDao.getSubjectById(id);
		if (subject != null) {
			subjectDao.deleteSubject(subject);
		}
	}

	public Subject getSubjectByID(int id) {
		return subjectDao.getSubjectById(id);
	}

	public Subject getSubjectByFullName(String name) {
		return subjectDao.getSubjectByName(name);
	}

	public List<Subject> getAllSubjects() {
		return subjectDao.getAllSubjects();
	}

	public void showAllSubjectsWithTeachers() {
		System.out.println("SUBJECTS:");
		subjectDao.getAllSubjects().forEach(subjects -> {
			System.out.println("Subject: [" + subjects.getId() + "] - " + subjects.getName());
			subjects.getTeachers().forEach(System.out::println);
		});

		System.out.println();
	}

	public void showSubjectWithTeachersById(int id) {
		Subject subject = subjectDao.getSubjectById(id);
		System.out.println(subject + ":");
		subject.getTeachers().forEach(System.out::println);

		System.out.println();
	}

	public void showSubjectWithTeachersByFullName(String name) {
		Subject subject = subjectDao.getSubjectByName(name);
		System.out.println(subject + ":");
		subject.getTeachers().forEach(System.out::println);

		System.out.println();
	}

}
