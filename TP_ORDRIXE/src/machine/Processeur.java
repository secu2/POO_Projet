package machine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import machine.operateurs.*;

/**
 *	La composante principale de l'architecture matérielle, le processeur
 */
public class Processeur {
	Memoire memoire;
	int compteurOrdinal;
	/**
	 * Crée un processeur et sa mémoire
	 */
	public Processeur(int tailleMem){
		memoire = new Memoire(tailleMem);
	}
	
	/**
	 * Permet de récupérer l'état actuelle du compteur ordinal du processeur
	 * @return compteurOrdinal
	 */
	public int compteurOrdinal(){
		return compteurOrdinal;
	}
	
	/**
	 * Permet de modifier le compteur ordinal du processeur
	 * @param compteurOrdinal
	 */
	public void compteurOrdinal(int compteurOrdinal){
		//Définition du compteur ordinal
		this.compteurOrdinal = compteurOrdinal;
	}
	
	/**
	 * Permet de récupérer la mémoire
	 * @return la mémoire
	 */
	public Memoire memoire(){
		//Renvoi de la mémoire
		return memoire;
	}
	
	/**
	 * Permet de changer la mémoire utilisée par le processeur
	 * @param memoire la nouvelle mémoire
	 */
	public void Memoire(Memoire memoire){
		//Modification de la mémoire
		this.memoire = memoire;
	}
	
	/**
	 * Permet d'executer l'instruction se situant à l'adresse
	 * du compteur ordinal
	 * @return état du joueur effectuant l'appel (true/false)
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public boolean exec(){
		boolean playerIsAlive = true;
		String operateur = memoire.lire(compteurOrdinal).operateur();
		if(operateur.equals("DAT")){
			playerIsAlive = false;
		}else{
			Class classe;
			try {
				classe = Class.forName("machine.operateurs."+operateur);
				Constructor constructeur = classe.getConstructor(new Class [] {Class.forName("machine.Memoire"), Class.forName("machine.adressage.Adresse"), Class.forName("machine.adressage.Adresse")});
				constructeur.newInstance(new Object [] {memoire, memoire.lire(compteurOrdinal).operandes.operandeGauche(), memoire.lire(compteurOrdinal).operandes.operandeDroit()});
			} catch (ClassNotFoundException e) {
				System.err.println("Erreur: Impossible de trouver la classe "+operateur+".");
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return playerIsAlive;
	}
	
	
}
