package machine.operateurs;


public class JMZ extends Branchements{

	/**
	 * Constructeur de la classe JMZ
	 */
	JMZ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Modifie le compteur ordinal du processus courant conditionnellement si l'argument est nul
	 * @param proc processeur de la machine
	 * @param mem mémoire du jeu
	 * @param gauche opérande gauche
	 * @param droit opérande droit
	 */
	JMZ(machine.Processeur proc, machine.Memoire mem, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() == 0){
			proc.compteurOrdinal(gauche.adresse());
		}
	}

}
