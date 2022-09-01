package application;

public class Enseignants {
	private String idenseignants;
	private String passwordenseignants;
public Enseignants() {
		super();
	}
	public Enseignants(String idenseignants, String passwordenseignants) {
		super();
		this.idenseignants = idenseignants;
		this.passwordenseignants = passwordenseignants;
}
	public String getIdenseignants() {
		return idenseignants;
	}
	public void setIdenseignants(String idenseignants) {
		this.idenseignants = idenseignants;
	}
	public String getPasswordenseignants() {
		return passwordenseignants;
	}
	public void setPasswordenseignants(String passwordenseignants) {
		this.passwordenseignants = passwordenseignants;
	}

}
