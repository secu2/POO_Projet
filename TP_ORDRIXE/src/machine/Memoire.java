package machine;

import java.util.ArrayList;

import machine.adressage.Adresse;

/**
 * Composant mémoire de la machine
 *	est composé d'un simple tableau
 */
public class Memoire {
	protected ArrayList<Instruction> mem;
	public int compteurOrdinal;
	
	/**
	 * Génère une mémoire avec un nombre de cases définie
	 * @param taille Nombre de cases mémoire pour la machine
	 */
	public Memoire(int taille){
		mem = new ArrayList<Instruction>();
		remplir(taille);
	}
	
	/**
	 * Génere une mémoire par défaut
	 */
	public Memoire(){
		mem = new ArrayList<Instruction>();
		
	}
	
	/**
	 * @param dimension dimension de la mémoire
	 * Remplissage de la mémoire avec une taille définie
	 */
	private void remplir(int dimension){
			while(mem.size() < dimension) {
				mem.add(new Instruction());
			}
	}
	
	/**
	 * @return Informations sur la mémoire
	 */
	public ArrayList<String> infosMemoire(){
		ArrayList<String> infos = new ArrayList<String>();
		infos.add("Taille totale de la mémoire: "+ mem.size());
		return infos;
	}
	
	public Instruction lire(int adresse){
		return mem.get(adresse);
	}
	
	/**
	 * Ecrit dans la mémoire à une adresse donnée une instruction
	 * @param adresse
	 * @param instruction
	 */
	public void ecrire(int adresse, Instruction instruction){
		mem.set(adresse, instruction);
	}
	
	public int getCompteurOrdinal(int adresse){
		compteurOrdinal = (adresse+1)%mem.size();
		return compteurOrdinal;
	}
	
	
}
