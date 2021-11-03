package studentjava.classes;

public abstract class People {
	
	protected String name;
	protected int age;
	protected String birthDate;
	protected String generalRecord;
	protected String numberCpf;
	protected String motherName;
	protected String fatherName;
		
	public abstract double salario();
	
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
	
}
