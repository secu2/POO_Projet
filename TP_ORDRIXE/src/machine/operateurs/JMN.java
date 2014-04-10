package machine.operateurs;

public class JMN extends Branchements{

	/**
	 * Constructeur de la classe JMN
	 */
	JMN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Modifie le compteur ordinal du processus courant conditionnellement si l'argument B est non nul.
	 * @param proc processeur de la machine
	 * @param gauche opérande gauche
	 * @param droit opérande droit
	 */
	JMN(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		//Si l'opérateur droit n'est pas nul
		if(droit.adresse() != 0){
			//Modification du compteur ordinal
			proc.compteurOrdinal(gauche.adresse());
		}
	}
}
