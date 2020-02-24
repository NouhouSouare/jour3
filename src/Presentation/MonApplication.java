package Presentation;

import Domaine.Employe;
import Domaine.Manager;
import Domaine.DemandeFormation;

public class MonApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe employe1;
		Employe employe2;
		Manager manager1;
		
		employe1 = new Employe("Souare ", "Nouhou ", 1);
		employe2 = new Employe("Bah ", "Alhassane ", 2);
		manager1 = new Manager("Zed ", "Camara ", 3);
				
		employe1.DemanderFormation("La Formation en Initiation Objet avec JAVA ");
		//("Initiation Objet avec JAVA");
		
		
		System.out.println(employe1);
		System.out.println(manager1);
		System.out.println(employe2);
		
		employe2.DemanderFormation("JAVA");
		manager1.DemanderFormation("Python ");
		
		
	}
	

}
