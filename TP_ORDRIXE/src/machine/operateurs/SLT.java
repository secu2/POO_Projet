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
	 * Modifie le comteur ordinal du processus courant conditionnellement si l'argument A est plus petit que l'argument B.
	 * @param proc processeur de la machine
	 * @param gauche operande gauche
	 * @param droit operande droit
	 */
	SLT(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() != gauche.adresse()){
			proc.compteurOrdinal(proc.compteurOrdinal()+1);
		}
	}

}
