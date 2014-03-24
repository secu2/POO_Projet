package machine;

import java.util.ArrayList;

/**
 * Composant mémoire de la machine
 *	est composé d'un simple tableau
 */
public class Memoire {
	private Instruction[] mem;
	
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
	
	public void ecrire(int adresse, Instruction instruction){
		mem[adresse] = instruction;
	}
	
}