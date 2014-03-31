package machine.operateurs;

import machine.adressage.Adresse;

/**
 * Affecte la mémoire avec le contenu d'une autre
 */
public class MOV extends Operation{

	MOV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Affecte le contenu d'une case mémoire dans une autre
	 * @param origine la case mémoire à copier
	 * @param destination la case mémoire à écrire
	 */
	public void exec(Adresse origine, Adresse destination){
		memoire().ecrire(destination.adresse(), memoire().lire(destination.adresse()));
	}

}
