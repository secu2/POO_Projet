package machine;

import java.util.ArrayList;

/**
 * Composant mémoire de la machine
 *	est composé d'un simple tableau
 */
public class Memoire {
	private Instruction[] mem;
	public int compteurOrdinal;
	
	/**
	 * Génère une mémoire avec un nombre de cases définies
	 * @param taille Nombre de cases mémoire pour la machine
	 */
	public Memoire(int taille){
		this.remplir(taille);
	}
	
	/**
	 * Génere une mémoire de 100 cases par défaut
	 */
	public Memoire(){
		this.remplir(100);
	}
	
	/**
	 * @param dimension
	 * Remplissage de la mémoire avec une taille définie
	 */
	private void remplir(int dimension){
			for (int i = 0; i < mem.length; i++) {
				mem[i] = new Instruction();
			}
	}
	
	/**
	 * @return Informations sur la mémoire
	 */
	public ArrayList<String> infosMemoire(){
		ArrayList<String> infos = new ArrayList<String>();
		infos.add("Taille totale de la mémoire: "+ mem.length);
		return infos;
	}
	
	public Instruction lire(int adresse){
		return mem[adresse];
	}
	
	/**
	 * Ecrit dans la mémoire à une adresse donné une instruction
	 * @param adresse
	 * @param instruction
	 */
	public void ecrire(int adresse, Instruction instruction){
		mem[adresse] = instruction;
	}
	
	/**
	 * Ecrit dans la mémoire à une adresse donnée ajoutée à 
	 * un offset l'instruction
	 * @param adresse
	 * @param offset
	 * @param instruction
	 */
	public void ecrireRelatif(int adresse, int offset, Instruction instruction){
		mem[adresse+offset] = instruction;
	}
	
	/**
	 * Ecrit l'instruction à l'adresse désignée par 
	 * l'opérande droit de la mémoire à l'adresse renseignée
	 * @param adresse
	 * @param instruction
	 */
	public void ecrireIndirect(int adresse, Instruction instruction){
		mem[mem[adresse].operandeDroit.operande] = instruction;
	}
	
	public int getCompteurOrdinal(int adresse){
		compteurOrdinal = (adresse+1)%mem.length;
		return compteurOrdinal;
	}
	
	
	
}
