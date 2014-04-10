package systeme;
import java.lang.reflect.InvocationTargetException;

import machine.Instruction;
import machine.Memoire;
import machine.Operandes;
import machine.Processeur;
import machine.adressage.*;
import systeme.Chargeur;

public class Jeu {
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
		//Main class
		Chargeur chargeur = new Chargeur();
		Processeur processeur = new Processeur();
		
		//chargeur.charger(processeur.memoire(), 0, new Instruction());

		chargeur.charger(processeur.memoire(), 1, new Instruction("ADD", new Operandes(new Immediat(12), new Immediat(13))));
		chargeur.charger(processeur.memoire(), 12, new Instruction("ADD", new Operandes(new Immediat(27), new Immediat(28))));

		System.out.println(processeur.memoire().infosMemoire());
		//processeur.memoire().ecrire(0, new Instruction("test", new Operandes(new Immediat(12), new Immediat(13))));
		System.out.println(processeur.memoire().lire(1).operandes().operandeGauche().adresse());
		processeur.compteurOrdinal(1);
		System.out.println(processeur.exec());
		System.out.println(processeur.memoire().lire(13).operandes().operandeDroit().adresse());
		
	}
}
