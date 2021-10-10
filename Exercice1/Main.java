package Exercice1;

/**
 * 
 * @author zahra // pour generate javadoc Project --> generate javadoc
 *
 */
class Main {
	public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth);
		mere.printMeth();
		Fille fille = new Fille();
		System.out.println(fille.meth);
		fille.printMeth();
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth);
		mereFille.printMeth();
		
		
		// 1- les reponses sont : 42 42 24 24 24 24 car on a creer respectivement une mere puis 2 sysout, apres une fille et 2 sysout apres une fille et 2 sysout
		// 2- La fille a acces a seulement sa methode meth pas a celle de la mere car elle a reecrit cette methode dans ca classe, si elle avait pas la methode elle aurais eu l'access a celle de la classe mere.
		// La fille a acces a la method meth en juste tappent fille. 
		
		// 3- les reponses sont : 42 42 24 42 42 42 car on a creer mere puis 2 sysout, apres fille un sysout, puis apres printmeth dans la class mere apelle meth qui est static donc renvois 42
		
		// 4- Si meth aurais etait des champs c'est les meme reponse que la question 3 car quand une method invoque un champs elle va appeller le champs qui est propre a ca classe meme si c'est la classe fille qui appelle la methode.
		
		
		
	}
}