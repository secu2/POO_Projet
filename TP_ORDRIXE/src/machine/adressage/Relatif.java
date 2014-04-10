package machine.adressage;

public class Relatif extends Adresse {

	/**
	 * Permet de contruire une adresse à partir d'un adressage relatif : adresse+offset
	 * @param adresse
	 * @param offset valeur de l'offset
	 */
	public Relatif(int adresse, int offset){
		//Construction adresse
		this.adresse = adresse+offset;
	}
}
