package studentjava.classes;

import java.util.Objects;

public class Discipline {
	/* Essa classe "Subject" servirá para todos os objetos e instancias de notas e disciplinas. */
	private double note;
	private String discipline;
	/* "SET recebe os dados" e o "GET retorna estes dados".*/
	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	/* Equals e Hashcode (Diferenciar e comparar objetos na memória) */
	@Override
	public int hashCode() {
		return Objects.hash(note, discipline);
	}
	/* Endereço do objeto na memória do java */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		return Double.doubleToLongBits(note) == Double.doubleToLongBits(other.note)
				&& Objects.equals(discipline, other.discipline);
	}
	
	@Override
	public String toString() {
		return "Discipline [note=" + note + ", discipline=" + discipline + "]";
	}

}
