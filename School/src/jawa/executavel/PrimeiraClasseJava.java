package jawa.executavel;

import javax.swing.JOptionPane;


import studentjava.classes.Student;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/*1º Student */ 
		String name1 = JOptionPane.showInputDialog("Qual é o nome do aluno ?");
		String age1 = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate1 = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord1 = JOptionPane.showInputDialog("R.G ?");
		String numbercpf1 = JOptionPane.showInputDialog("C.P.F ?");
		String motherName1 = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName1 = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate1 = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName1 = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled1 = JOptionPane.showInputDialog("Series Enrolled ?");
		String noteA = JOptionPane.showInputDialog("NoteA ?");
		String noteB = JOptionPane.showInputDialog("NoteB ?");
		String noteC = JOptionPane.showInputDialog("NoteC ?");
		String noteD = JOptionPane.showInputDialog("NoteD ?");
		
		Student student1 = new Student();
		
		student1.setName(name1); 
		student1.setAge(Integer.valueOf(age1)); /* <- converte a String em Int */
		student1.setBirthDate(birthDate1);
		student1.setGeneralRecord(generalRecord1);
		student1.setNumberCpf(numbercpf1);
		student1.setMotherName(motherName1);
		student1.setFatherName(fatherName1);
		student1.setEnrollmentDate(enrollmentDate1); 
		student1.setSchoolName(schoolName1);
		student1.setSeriesEnrolled(seriesEnrolled1); 
		student1.setNote1(Integer.valueOf(noteA));/* <- converte a String em Int */
		student1.setNote2(Integer.valueOf(noteB));/* <- converte a String em Int */
		student1.setNote3(Integer.valueOf(noteC));/* <- converte a String em Int */
		student1.setNote4(Integer.valueOf(noteD));/* <- converte a String em Int */
		
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Birth Date: " + student1.getBirthDate());
		System.out.println("R.G: " + student1.getGeneralRecord());
		System.out.println("C.P.F: " + student1.getNumberCpf());
		System.out.println("Mother Name: " + student1.getMotherName());
		System.out.println("FatherName: " + student1.getFatherName());
		System.out.println("SchoolName: " + student1.getSchoolName());
		System.out.println("SeriesEnrolled: " + student1.getSeriesEnrolled());
		System.out.println("student media: " + (student1.getApprovedStudent() ? "ApprovedStudent" : "Disapproved"));
		System.out.println("----------------------------------------");
		
		/* 2º Student */
		String name2 = JOptionPane.showInputDialog("Qual é o nome do aluno ?");
		String age2 = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate2 = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord2 = JOptionPane.showInputDialog("R.G ?");
		String numbercpf2 = JOptionPane.showInputDialog("C.P.F ?");
		String motherName2 = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName2 = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate2 = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName2 = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled2 = JOptionPane.showInputDialog("Series Enrolled ?");
		String noteE = JOptionPane.showInputDialog("NoteE ?");
		String noteF = JOptionPane.showInputDialog("NoteF ?");
		String noteG = JOptionPane.showInputDialog("NoteG ?");
		String noteH = JOptionPane.showInputDialog("NoteH?");
				
		Student student2 = new Student();
		
		student2.setName(name2); 
		student2.setAge(Integer.valueOf(age2)); /* <- converte a String em Int */
		student2.setBirthDate(birthDate2);
		student2.setGeneralRecord(generalRecord2);
		student2.setNumberCpf(numbercpf2);
		student2.setMotherName(motherName2);
		student2.setFatherName(fatherName2);
		student2.setEnrollmentDate(enrollmentDate2); 
		student2.setSchoolName(schoolName2);
		student2.setSeriesEnrolled(seriesEnrolled2); 
		student2.setNote1(Integer.valueOf(noteE));/* <- converte a String em Int */
		student2.setNote2(Integer.valueOf(noteF));/* <- converte a String em Int */
		student1.setNote3(Integer.valueOf(noteG));/* <- converte a String em Int */
		student1.setNote4(Integer.valueOf(noteH));/* <- converte a String em Int */
		
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Birth Date: " + student2.getBirthDate());
		System.out.println("R.G: " + student2.getGeneralRecord());
		System.out.println("C.P.F" + student2.getNumberCpf());
		System.out.println("Mother Name: " + student2.getMotherName());
		System.out.println("Father Name: " + student2.getFatherName());
		System.out.println("Enrollment Date: " + student2.getEnrollmentDate());
		System.out.println("SchoolName: " + student2.getSchoolName());
		System.out.println("Series Enrolled: " + student2.getSeriesEnrolled());
		System.out.println("Student media: " + (student2.getApprovedStudent() ? "Aprovado" : "Reprovado"));
		System.out.println("----------------------------------------");
		
		/* 3º Student */		
		String name3 = JOptionPane.showInputDialog("Qual é o nome do aluno ?");
		String age3 = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate3 = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord3 = JOptionPane.showInputDialog("R.G ?");
		String numbercpf3 = JOptionPane.showInputDialog("C.P.F ?");
		String motherName3 = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName3 = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate3 = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName3 = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled3 = JOptionPane.showInputDialog("Series Enrolled ?");
		String noteI = JOptionPane.showInputDialog("NoteI ?");
		String noteJ = JOptionPane.showInputDialog("NoteK ?");
		String noteK = JOptionPane.showInputDialog("NoteJ ?");
		String noteL = JOptionPane.showInputDialog("NoteJ?");
		
		Student student3 = new Student();
		
		student3.setName(name3);
		student3.setAge(Integer.valueOf(age3));
		student3.setBirthDate(birthDate3);
		student3.setGeneralRecord(generalRecord3);
		student3.setNumberCpf(numbercpf3);
		student3.setMotherName(motherName3);
		student3.setFatherName(fatherName3);
		student3.setEnrollmentDate(enrollmentDate3);
		student3.setSchoolName(schoolName3);
		student3.setSeriesEnrolled(seriesEnrolled3);
		student3.setNote1(Integer.valueOf(noteI));
		student3.setNote2(Integer.valueOf(noteJ));
		student3.setNote3(Integer.valueOf(noteK));
		student3.setNote4(Integer.valueOf(noteL));
		
		System.out.println("Name: " + student3.getName());
		System.out.println("Age: " + student3.getAge());
		System.out.println("Birth Date: " + student3.getBirthDate());
		System.out.println("R.G: " + student3.getGeneralRecord());
		System.out.println("C.P.F" + student3.getNumberCpf());
		System.out.println("Mother Name: " + student3.getMotherName());
		System.out.println("Father Name: " + student3.getFatherName());
		System.out.println("Enrollment Date: " + student3.getEnrollmentDate());
		System.out.println("SchoolName: " + student3.getSchoolName());
		System.out.println("Series Enrolled: " + student3.getSeriesEnrolled());
		System.out.println("Student media: " + (student3.getApprovedStudent() ? "Aprovado" : "Reprovado"));
		System.out.println("----------------------------------------");
		
		/* 4º Student */
		String name4 = JOptionPane.showInputDialog("Qual é o nome do aluno ?");
		String age4 = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate4 = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord4 = JOptionPane.showInputDialog("R.G ?");
		String numbercpf4 = JOptionPane.showInputDialog("C.P.F ?");
		String motherName4 = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName4 = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate4 = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName4 = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled4 = JOptionPane.showInputDialog("Series Enrolled ?");
		String noteM = JOptionPane.showInputDialog("NoteM ?");
		String noteN = JOptionPane.showInputDialog("NoteN ?");
		String noteO = JOptionPane.showInputDialog("NoteO ?");
		String noteP = JOptionPane.showInputDialog("NoteP?");
		/*- Contrutor com dois parametros */
		Student student4 = new Student("Juliana Pierri", 13);
		
		student4.setName(name4);
		student4.setAge(Integer.valueOf(age4));
		student4.setBirthDate(birthDate4);
		student4.setGeneralRecord(generalRecord4);
		student4.setNumberCpf(numbercpf4);
		student4.setMotherName(motherName4);
		student4.setFatherName(fatherName4);
		student4.setEnrollmentDate(enrollmentDate4);
		student4.setSchoolName(schoolName4);
		student4.setSeriesEnrolled(seriesEnrolled4);
		student4.setNote1(Integer.valueOf(noteM));
		student4.setNote2(Integer.valueOf(noteN));
		student4.setNote3(Integer.valueOf(noteO));
		student4.setNote4(Integer.valueOf(noteP));
		
		System.out.println("Name: " + student4.getName());
		System.out.println("Age: " + student4.getAge());
		System.out.println("Birth Date: " + student4.getBirthDate());
		System.out.println("R.G: " + student4.getGeneralRecord());
		System.out.println("C.P.F" + student4.getNumberCpf());
		System.out.println("Mother Name: " + student4.getMotherName());
		System.out.println("Father Name: " + student4.getFatherName());
		System.out.println("Enrollment Date: " + student4.getEnrollmentDate());
		System.out.println("SchoolName: " + student4.getSchoolName());
		System.out.println("Series Enrolled: " + student4.getSeriesEnrolled());
		System.out.println("Student media: " + (student4.getApprovedStudent() ? "Aprovado" : "Reprovado"));
		System.out.println("----------------------------------------");
		
		/* 5º Student */		
		String age5 = JOptionPane.showInputDialog("Age ?");/* <- Tem que converter a String em Int */
		String birthDate5 = JOptionPane.showInputDialog("Birth Date ?");
		String generalRecord5 = JOptionPane.showInputDialog("R.G ?");
		String numbercpf5 = JOptionPane.showInputDialog("C.P.F ?");
		String motherName5 = JOptionPane.showInputDialog("Mother Name ?");
		String fatherName5 = JOptionPane.showInputDialog("Father Name ?");
		String enrollmentDate5 = JOptionPane.showInputDialog("Enrollment Date ?");
		String schoolName5 = JOptionPane.showInputDialog("School Name ?");
		String seriesEnrolled5 = JOptionPane.showInputDialog("Series Enrolled ?");
		String noteQ= JOptionPane.showInputDialog("NoteQ ?");
		String noteR= JOptionPane.showInputDialog("NoteR ?");
		String noteS = JOptionPane.showInputDialog("NoteS ?");
		String noteT = JOptionPane.showInputDialog("NoteT?");
		/* - construtor com um parametros */
		Student student5 = new Student("Maria Elizene");
		
		student5.setAge(Integer.valueOf(age5));
		student5.setBirthDate(birthDate5);
		student5.setGeneralRecord(generalRecord5);
		student5.setNumberCpf(numbercpf5);
		student5.setMotherName(motherName5);
		student5.setFatherName(fatherName5);
		student5.setEnrollmentDate(enrollmentDate5);
		student5.setSchoolName(schoolName5);
		student5.setSeriesEnrolled(seriesEnrolled5);
		student5.setNote1(Integer.valueOf(noteQ));
		student5.setNote2(Integer.valueOf(noteR));
		student5.setNote3(Integer.valueOf(noteS));
		student5.setNote4(Integer.valueOf(noteT));
		
		System.out.println("Name: " + student5.getName());
		System.out.println("Age: " + student5.getAge());
		System.out.println("Birth Date: " + student5.getBirthDate());
		System.out.println("R.G: " + student5.getGeneralRecord());
		System.out.println("C.P.F" + student5.getNumberCpf());
		System.out.println("Mother Name: " + student5.getMotherName());
		System.out.println("Father Name: " + student5.getFatherName());
		System.out.println("Enrollment Date: " + student5.getEnrollmentDate());
		System.out.println("SchoolName: " + student5.getSchoolName());
		System.out.println("Series Enrolled: " + student5.getSeriesEnrolled());
		System.out.println("Student media: " + (student5.getApprovedStudent() ? "Aprovado" : "Reprovado"));
		
	}
}
