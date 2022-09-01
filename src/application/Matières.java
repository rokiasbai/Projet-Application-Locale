package application;

public class Matières {
	private int idmatière;
	private String nommatière;
	private String module_modulecol;
	
public Matières() {
	super();
}
public Matières(int idmatière, String nommatière, String module_modulecol) {
	super();
	this.idmatière = idmatière;
	this.nommatière = nommatière;
	this.module_modulecol = module_modulecol;
}
public int getIdmatière() {
	return idmatière;
}
public void setIdmatière(int idmatière) {
	this.idmatière = idmatière;
}
public String getNommatière() {
	return nommatière;
}
public void setNommatière(String nommatière) {
	this.nommatière = nommatière;
}
public String getModule_modulecol() {
	return module_modulecol;
}
public void setModule_modulecol(String module_modulecol) {
	this.module_modulecol = module_modulecol;
}


}
