package Domaine;

public class Employe {
	
		public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Id = id;
	}
		public Employe() {
			
		}
		
		String nom;
		
		String prenom;
		
		int Id;
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		
		public void DemanderFormation(String theme) {
			
			System.out.println("L'employe " + this.prenom + " " + this.nom + "Demande " + theme);
		
		}
		@Override
		public String toString() {
			return "Employe [nom = " + nom + ", prenom = " + prenom + ", Id = " + Id + "]";
			
		}
		
	
		
		
	}


