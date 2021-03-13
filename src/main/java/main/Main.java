package main;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import entity.Subject;
import entity.Teacher;
import service.Service;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		Service college = new Service();
		Teacher teacher = new Teacher();
		Subject subject = new Subject();
		Set<Subject> subjects = new HashSet<>();
		Set<Teacher> teachers = new HashSet<>();
		
//		college.updateTeacher(teacher);
//		subject.setName("tt");
//		teacher.setName("tt");
//		teacher.setSurname("tt");
//		teacher.setLastName("tt");
//		teacher.setSubjects(subjects);
//		teachers.add(teacher);
//		subject.setTeachers(teachers);
//		subjects.add(subject);
//		
//		college.addSubject(subject);
//		college.addTeacher(teacher);
		
/*		subject = college.getSubjectByID(28);
		teacher = college.getTeacherByID(53);
		
		subjects = teacher.getSubjects(); 
		subjects.add(subject);
		teacher.setSubjects(subjects);
		college.updateTeacher(teacher);     צו ןנאצ‏÷ */
		
/*		subject = college.getSubjectByID(27);
		teacher = college.getTeacherByID(12);
		
		teachers = subject.getTeachers();
		teachers.add(teacher);
		subject.setTeachers(teachers);
		college.updateSubject(subject);      םו ןנאצ‏÷ */

//		college.showAllSubjectsWithTeachers();
//		college.showSubjectWithTeachersById(6);
//		college.showSubjectWithTeachersByFullName("Maths");

		college.showTeacherWithSubjectsById(1);
		college.showTeacherWithSubjectsByFullName("Ivanov", "Ivan", "Ivanovych");
		college.showAllTeachersWithSubjects();
		
//		college.deleteTeacher(49);
//		college.deleteSubject(25);

		HibernateUtil.close();
	}

}
