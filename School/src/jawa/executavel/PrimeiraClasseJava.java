package jawa.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import jawa.constantes.StatusStudent;
import studentjava.classes.Discipline;
import studentjava.classes.Student;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String passoard = JOptionPane.showInputDialog("Informe o passoard");
		
		if (login.equalsIgnoreCase("adimin") && 
				passoard.equalsIgnoreCase("adimin")) {
			
		List<Student> students = new ArrayList<Student>();
		
		HashMap<String, List<Student>> maps = new HashMap<String, List<Student>>();
		
		for (int qtd = 1; qtd <= 2; qtd++) {
		
		String name = JOptionPane.showInputDialog("What is the student's name "+ qtd);
		String age = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord = JOptionPane.showInputDialog("R.G ?");
		String numbercpf = JOptionPane.showInputDialog("C.P.F ?");
		String motherName = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled = JOptionPane.showInputDialog("Series Enrolled ?");
		
		Student student = new Student();
		
		student.setName(name); 
		student.setAge(Integer.valueOf(age)); /* <- converte a String em Int */
		student.setBirthDate(birthDate);
		student.setGeneralRecord(generalRecord);
		student.setNumberCpf(numbercpf);
		student.setMotherName(motherName);
		student.setFatherName(fatherName);
		student.setEnrollmentDate(enrollmentDate); 
		student.setSchoolName(schoolName);		
		student.setSeriesEnrolled(seriesEnrolled); 
		
		for(int pos = 1; pos <= 4; pos++) {
			
		
			String nameDiscipline = JOptionPane.showInputDialog("Discipline: ");
			String noteStudent = JOptionPane.showInputDialog("Note: ");
			
			Discipline discipline = new Discipline();
			discipline.setDiscipline(nameDiscipline);
			discipline.setNote(Double.valueOf(noteStudent));
			
			student.getDisciplines().add(discipline);
		}
		
		int choice  = JOptionPane.showConfirmDialog(null, "Want to remove some discipline?");
		
		if (choice == 0) { /* Opção SIM é Zero -- (Opção NAO seria UM )*/
			
			int continueRemove = 0;
			int  position = 1;
			
			while (continueRemove == 0) {
				
				String disciplineRemove = JOptionPane.showInputDialog("What is discipline1, 2, 3 ou 4?");
				student.getDisciplines().remove(Integer.valueOf(disciplineRemove).intValue() - position);
				position ++; /* ++ soma + 1*/
				continueRemove = JOptionPane.showConfirmDialog(null, "Continue to remove?");
				
			}
		}
		
		 students.add(student);
		
		}
		maps.put(StatusStudent.APPROVED, new ArrayList<Student>());
		maps.put(StatusStudent.RECOVERY, new ArrayList<Student>());
		maps.put(StatusStudent.DISAPPROVED, new ArrayList<Student>());
		
		for (Student student : students) {
			
			if (student.getApprovedStudent().equalsIgnoreCase(StatusStudent.APPROVED)) {
				maps.get(StatusStudent.APPROVED).add(student);
			}else if (student.getApprovedStudent().equalsIgnoreCase(StatusStudent.RECOVERY)) {
				maps.get(StatusStudent.RECOVERY).add(student);
			}else if (student.getApprovedStudent().equalsIgnoreCase(StatusStudent.DISAPPROVED)) {
				maps.get(StatusStudent.DISAPPROVED).add(student);
			}
		}
		
		System.out.println("-------------------Approved--------------------");
		for (Student student : maps.get(StatusStudent.APPROVED)) {
			System.out.println("Result: " + student.getApprovedStudent() + "with the average: " + student.getAverageGrade());
		}
		
		System.out.println("-------------------Disapproved--------------------");
		for (Student student : maps.get(StatusStudent.DISAPPROVED)) {
			System.out.println("Result: " + student.getApprovedStudent() + "with the average: " + student.getAverageGrade());
		}
		System.out.println("-------------------Recovery--------------------");
		for (Student student : maps.get(StatusStudent.RECOVERY)) {
			System.out.println("Result: " + student.getApprovedStudent() + "with the average: " + student.getAverageGrade());
		}
		
	}
		
	}
		
}
