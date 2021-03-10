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
		
		
//		System.out.println(college.getAllSubjects());
//		System.out.println(college.getAllTeachers().get(3));
//		teacher = college.getAllTeachers().get(3);
//		teacher.setSubjects(college.getAllSubjects().stream().collect(Collectors.toSet()));
//		college.updateTeacher(teacher);
//		subject.setName("tuño tuño tuño");
//		teacher.setName("tuño");
//		teacher.setSurname("tuño");
//		teacher.setLastName("tuño");
//		teachers.add(teacher);
//		subject.setTeachers(teachers);
//		teacher.setSubjects(subjects);
//		subjects.add(subject);
//		
//		college.addSubject(subject);
		//college.addTeacher(teacher);
		
		//college.deleteSubject(22);
		
//		college.addTeacherToSubjectAndSubjectToTeacher(12, 25);  // ùî öå???????

//		college.showAllSubjectsWithTeachers();
//		college.showSubjectWithTeachersById(6);
//		college.showSubjectWithTeachersByFullName("Maths");

//		college.showTeacherWithSubjectsById(1);
//		college.showTeacherWithSubjectsByFullName("Ivanov", "Ivan", "Ivanovych");
//		college.showAllTeachersWithSubjects();
		college.deleteTeacher(16);
//		college.deleteSubject(6);

		HibernateUtil.close();
	}

}
