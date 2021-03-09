package main;

import entity.Subject;
import entity.Teacher;
import service.Service;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		Service college = new Service();
		Teacher teacher = new Teacher();
		Subject subject = new Subject();

//		college.addTeacherToSubjectAndSubjectToTeacher(12, 8);

//		college.showAllSubjectsWithTeachers();
//		college.showSubjectWithTeachersById(6);
//		college.showSubjectWithTeachersByFullName("Maths");

//		college.showTeacherWithSubjectsById(1);
//		college.showTeacherWithSubjectsByFullName("Ivanov", "Ivan", "Ivanovych");
//		college.showAllTeachersWithSubjects();
//		college.deleteTeacher(8);
		college.deleteSubject(6);

		HibernateUtil.close();
	}

}
