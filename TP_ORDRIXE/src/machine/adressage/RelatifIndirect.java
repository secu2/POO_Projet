package machine.adressage;

import machine.Memoire;

public class RelatifIndirect extends Adresse {
	/**
	 * Permet de contruire une adresse à partir d'un adressage relatif.
	 * L'adresse et trouvée dans l'opérande droit de l'instruction située dans
	 * la case mémoire désignée par l'adresse+offset
	 * Nécéssite un accès à la mémoire pour récupérer la position de l'adresse
	 * @param memoire mémoire du jeu
	 * @param adresse
	 * @param offset valeur de l'offset
	 */
	public RelatifIndirect(Memoire memoire, int adresse, int offset){
		//Lecture dans la mémoire
		this.adresse = memoire.lire(adresse+offset).operandes().operandeDroit().adresse();
	}
}
