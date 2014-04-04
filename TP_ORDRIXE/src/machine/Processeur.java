package machine;
/**
 *	La coposante principale de l'architecture matérielle, le processeur
 */
public class Processeur {
	Memoire memoire;
	int compteurOrdinal;
	/**
	 * Crée un processeur et sa mémoire
	 */
	public Processeur(){
		memoire = new Memoire(100);
	}
	
	/**
	 * Permet de récupérer l'état actuelle du compteur ordinal du processeur
	 * @return
	 */
	public int compteurOrdinal(){
		return compteurOrdinal;
	}
	
	/**
	 * Permet de modifier le compteur ordinal du processeur
	 * @param compteurOrdinal
	 */
	public void compteurOrdinal(int compteurOrdinal){
		this.compteurOrdinal = compteurOrdinal;
	}
	
	/**
	 * Permet de récupérer la mémoire
	 * @return la mémoire
	 */
	public Memoire memoire(){
		return memoire;
	}
	
	/**
	 * Permet de changer la mémoire utilisée par le processeur
	 * @param memoire la nouvelle mémoire
	 */
	public void Memoire(Memoire memoire){
		this.memoire = memoire;
	}
	
	
}
