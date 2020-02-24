package Domaine;

public class DemandeFormation {
	public DemandeFormation(String theme, String dateDemande, String etatValidation) {
		super();
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
	}
	String theme;
	String dateDemande;
	String etatValidation; 
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	public String getEtatValidation() {
		return etatValidation;
	}
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}
	

}
