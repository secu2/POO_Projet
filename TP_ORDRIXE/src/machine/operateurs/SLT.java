package machine.operateurs;


public class SLT extends Branchements{

	/**
	 * Constructeur de la classe SLT
	 */
	SLT() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Modifie le compteur ordinal du processus courant conditionnellement si l'argument A est plus petit que l'argument B.
	 * @param proc processeur de la machine
	 * @param gauche operande gauche
	 * @param droit operande droit
	 */
	SLT(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		//Si l'opérande droit est supérieur à l'opérande gauche
		if(droit.adresse() > gauche.adresse()){
			//Modification du compteur ordinal
			proc.compteurOrdinal(proc.compteurOrdinal()+1);
		}
	}

}
