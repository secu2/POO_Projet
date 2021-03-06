package machine.operateurs;


public class CMP extends Branchements{

	/**
	 * Constructeur de la classe CMP
	 */
	CMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Modifie le compteur ordinal du processus courant conditionnellement si les arguments sont égaux.
	 * @param proc processeur de la machine
	 * @param gauche opérande gauche
	 * @param droit opérande droit
	 */
	CMP(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		// Si operande droit et opérande gauche sont égaux
		if(droit.adresse() == gauche.adresse()){
			//Modification du compteur
			proc.compteurOrdinal(proc.compteurOrdinal()+1); 
		}
	}

}
