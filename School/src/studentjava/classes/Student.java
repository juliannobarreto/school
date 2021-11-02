package studentjava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jawa.constantes.StatusStudent;

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
	/* Lista de disciplinas criadas */
	private List<Discipline> disciplines = new ArrayList<Discipline>();
	
	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}
	
	public List<Discipline> getDisciplines() {
		return disciplines;
	}
	
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


	public double getAverageGrade() {
		
		double somaNote = 0.0;
		
		for (Discipline subject : disciplines) {
			somaNote =+ subject.getNote() ;			
		}
		
		return somaNote / disciplines.size();
	}

	public String getApprovedStudent() {
		double media = this.getAverageGrade();
		if (media >= 50) {
			if ( media >= 70) {
				return StatusStudent.APPROVED;
			}else {
				return StatusStudent.RECOVERY;
			}
		}else {
				return StatusStudent.DISAPPROVED;
		}
		
	}
	/* Equals e Hashcode (Diferenciar e comparar objetos) */
	@Override
	public int hashCode() {
		return Objects.hash(name, numberCpf);
	}
	/* Endereço do objeto na memória do java */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", generalRecord="
				+ generalRecord + ", numberCpf=" + numberCpf + ", motherName=" + motherName + ", fatherName="
				+ fatherName + ", enrollmentDate=" + enrollmentDate + ", schoolName=" + schoolName + ", seriesEnrolled="
				+ seriesEnrolled + "]";
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