package main;


import java.util.HashSet;
import java.util.Set;

import entity.Subject;
import entity.Teacher;
import service.Service;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		Service college = new Service();
		Teacher teacher = new Teacher();
		Subject subject = new Subject();
		teacher = college.getTeacherByID(1);
		subject = college.getSubjectByID(6);
		Set<Subject> subjects = new HashSet<Subject>();
		subjects.add(subject);
		teacher.setSubjects(subjects);
		Set<Teacher> teachers = new HashSet<Teacher>();
		teachers.add(teacher);
		subject.setTeachers(teachers);


//		System.out.println(college.getAllTeachers());
//		System.out.println(college.getAllSubjects());
		HibernateUtil.close();
	}

}
