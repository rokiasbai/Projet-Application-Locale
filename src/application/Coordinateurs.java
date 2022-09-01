package application;

public class Coordinateurs {
	private String idcoordinateurs;
	private String passwordcoordinateurs;
public Coordinateurs() {
		super();
	}
	public Coordinateurs(String idcoordinateurs, String passwordcoordinateurs) {
		super();
		this.idcoordinateurs = idcoordinateurs;
		this.passwordcoordinateurs = passwordcoordinateurs;
}
	public String getIdcoordinateurs() {
		return idcoordinateurs;
	}
	public void setIdcoordinateurs(String idcoordinateurs) {
		this.idcoordinateurs = idcoordinateurs;
	}
	public String getPasswordcoordinateurs() {
		return passwordcoordinateurs;
	}
	public void setPasswordcoordinateurs(String passwordcoordinateurs) {
		this.passwordcoordinateurs = passwordcoordinateurs;
	}
}