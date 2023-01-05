package test.hibernate;

import java.util.List;

import test.hibernate.dao.StudentDao;
import test.hibernate.model.Student;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("arko", "saha", "arkosaha@gmail.com");
		studentDao.saveStudent(student);

		studentDao.insertStudent();

		// update student
		Student student1 = new Student("sumit", "saha", "sumitsaha@gmail.com");
		studentDao.updateStudent(student1);

		// get students
		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s.getFirstname()));

		// get single student
		Student student2 = studentDao.getStudent(1);
		System.out.println(student2.getFirstname());

		// delete student
		studentDao.deleteStudent(1);
	}
}