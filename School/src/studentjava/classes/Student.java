package studentjava.classes;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private String birthDate;
	private String generalRecord;
	private String numberCpf;
	private String motherName;
	private String fatherName;
	private String enrollmentDate;
	private String schoolName;
	private String seriesEnrolled;
	
	private double note1; 
	private double note2;
	private double note3;
	private double note4;
	
	public Student() {
		
	}
	
	public Student(String namePattern) {
		name = namePattern;
		
	}
	
	public Student (String namePattern, int agePattern) {
		name = namePattern;
		age = agePattern;
	}
	/* Set é para adcionar ou receber dados para os atributos */
	/* Get é para resgatar ou obter o valor atribuido */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGeneralRecord() {
		return generalRecord;
	}

	public void setGeneralRecord(String generalRecord) {
		this.generalRecord = generalRecord;
	}

	public String getNumberCpf() {
		return numberCpf;
	}

	public void setNumberCpf(String numberCpf) {
		this.numberCpf = numberCpf;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSeriesEnrolled() {
		return seriesEnrolled;
	}

	public void setSeriesEnrolled(String seriesEnrolled) {
		this.seriesEnrolled = seriesEnrolled;
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}

	public double getNote3() {
		return note3;
	}

	public void setNote3(double note3) {
		this.note3 = note3;
	}

	public double getNote4() {
		return note4;
	}

	public void setNote4(double note4) {
		this.note4 = note4;
	}
	
	public double getAverageGrade() {
		return (note1 + note2 + note3 + note4)/ 4;
	}

	public boolean getApprovedStudent() {
		double media = this.getAverageGrade();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	/* Endereço do objeto na memória do java */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", generalRecord="
				+ generalRecord + ", numberCpf=" + numberCpf + ", motherName=" + motherName + ", fatherName="
				+ fatherName + ", enrollmentDate=" + enrollmentDate + ", schoolName=" + schoolName + ", seriesEnrolled="
				+ seriesEnrolled + ", note1=" + note1 + ", note2=" + note2 + ", note3=" + note3 + ", note4=" + note4
				+ "]";
	}
	/* Equals e Hashcode (Diferenciar e comparar objetos) */
	@Override
	public int hashCode() {
		return Objects.hash(name, numberCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(numberCpf, other.numberCpf);
	}
	
	
}