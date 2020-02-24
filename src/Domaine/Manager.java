package Domaine;

public class Manager extends Employe {

	public Manager() {
		super();
		
	}

	public Manager(String nom, String prenom, int id) {
		super (nom, prenom, id);
	}

	@Override 
	public void DemanderFormation(String theme) {
		
		super.DemanderFormation(theme);
		System.out.println("Comme c'est un Manager, la Demande est acceptee.");
	}
	

}
