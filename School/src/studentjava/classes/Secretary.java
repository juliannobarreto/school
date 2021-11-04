package studentjava.classes;

import java.interfaces.PermitirAcess;

public class Secretary extends People implements PermitirAcess {

	private String record;
	private String levelPosition;
	private String experience;
	
	private String login;
	
	private String passoard;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassoard() {
		return passoard;
	}
	public void setPassoard(String senha) {
		this.passoard = senha;
	}
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
	/* Esse é o método do contrato de autenticação */
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && passoard.equals("admin"); 
	}
	
	
}
