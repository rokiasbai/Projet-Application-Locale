package application;

public class Etudiants {
	private int id�tudiants;
	private String nometudiant;
	private String prenometudiant;
	private String fili�re_Nom_fili�re;
	private String semestre_Nom_semestre;
	private String presence;
	private String tp;
	private String ecrit;
	private String validation;
	

public Etudiants() {
		super();
	}
public Etudiants(int id�tudiants, String nometudiant, String prenometudiant, String fili�re_Nom_fili�re, String semestre_Nom_semestre, String presence, String tp, String ecrit, String validation) {
	super();
	this.id�tudiants = id�tudiants;
	this.nometudiant = nometudiant;
	this.prenometudiant = prenometudiant;
	this.fili�re_Nom_fili�re = fili�re_Nom_fili�re;
	this.semestre_Nom_semestre = semestre_Nom_semestre;
	this.presence = presence;
	this.tp = tp;
	this.ecrit = ecrit;
	this.validation = validation;
	
}
public int getId�tudiants() {
	return id�tudiants;
}
public void setId�tudiants(int id�tudiants) {
	this.id�tudiants = id�tudiants;
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
public String getFili�re_Nom_fili�re() {
	return fili�re_Nom_fili�re;
}
public void setFili�re_Nom_fili�re(String fili�re_Nom_fili�re) {
	this.fili�re_Nom_fili�re = fili�re_Nom_fili�re;
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
