package studentjava.classes;

public class Secretary extends People {

	private String record;
	private String levelPosition;
	private String experience;
	
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getLevelPosition() {
		return levelPosition;
	}
	public void setLevelPosition(String levelPosition) {
		this.levelPosition = levelPosition;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Secretary [record=" + record + ", levelPosition=" + levelPosition + ", experience=" + experience + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
