package application;

public class Etudiants {
	private int idétudiants;
	private String nometudiant;
	private String prenometudiant;
	private String filière_Nom_filière;
	private String semestre_Nom_semestre;
	private String presence;
	private String tp;
	private String ecrit;
	private String validation;
	

public Etudiants() {
		super();
	}
public Etudiants(int idétudiants, String nometudiant, String prenometudiant, String filière_Nom_filière, String semestre_Nom_semestre, String presence, String tp, String ecrit, String validation) {
	super();
	this.idétudiants = idétudiants;
	this.nometudiant = nometudiant;
	this.prenometudiant = prenometudiant;
	this.filière_Nom_filière = filière_Nom_filière;
	this.semestre_Nom_semestre = semestre_Nom_semestre;
	this.presence = presence;
	this.tp = tp;
	this.ecrit = ecrit;
	this.validation = validation;
	
}
public int getIdétudiants() {
	return idétudiants;
}
public void setIdétudiants(int idétudiants) {
	this.idétudiants = idétudiants;
}
public String getNometudiant() {
	return nometudiant;
}
public void setNometudiant(String nometudiant) {
	this.nometudiant = nometudiant;
}
public String getPrenometudiant() {
	return prenometudiant;
}
public void setPrenometudiant(String prenometudiant) {
	this.prenometudiant = prenometudiant;
}
public String getFilière_Nom_filière() {
	return filière_Nom_filière;
}
public void setFilière_Nom_filière(String filière_Nom_filière) {
	this.filière_Nom_filière = filière_Nom_filière;
}
public String getSemestre_Nom_semestre() {
	return semestre_Nom_semestre;
}
public void setSemestre_Nom_semestre(String semestre_Nom_semestre) {
	this.semestre_Nom_semestre = semestre_Nom_semestre;
}
public String getPresence() {
	return presence;
}
public void setPresence(String presence) {
	this.presence = presence;
}
public String getTp() {
	return tp;
}
public void setTp(String tp) {
	this.tp = tp;
}
public String getEcrit() {
	return ecrit;
}
public void setEcrit(String ecrit) {
	this.ecrit = ecrit;
}
public String getValidation() {
	return validation;
}
public void setValidation(String validation) {
	this.validation = validation;
}

}
