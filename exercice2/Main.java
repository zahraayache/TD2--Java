package exercice2;

public class Main {

	public static void main(String[] args) throws Exception {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();

//		mere.miage();
		fille.miage();
//		mereFille.miage();
		((Fille)mereFille).miage();

		mere.a();
		mereFille.a();
		fille.a();
		((Mere)mereFille).a();
		mereFille.b(null);

		mereFille.c();
		mereFille.c(mere);
		
		mereFille.c(mereFille);
		mereFille.c(fille);
		fille.c(fille);

		mere.d();
		mereFille.d();
		

		mere.printF();
		mereFille.printF();

		mereFille.j();
		mereFille.k();
		mereFille.l();
		mereFille.m();
	}

	// 1- Les erreurs de compilation sont:
			//- Import IOException
			//- les methode h et i de fille doivent avoir la meme signature que celle de mere -->int et void
			//- Il ya pas de methode miage  dans la classe mere il faut ou les retirer ou les creer.

	// 2- J'ai arranger les methodes qui pausent problemes
	
	// 3- une surcharge d'une methode permet de definir plusieurs fois une meme metode avec des arguments/parametres differents, et le compilateur choisi la methode en fonction de ces paramettres.
	//	- une redefinition d'une methode est d'ecrire la meme methode d'une classe mere en garde la meme signature le meme nombre de parametre et throws les meme exceptions. si on respecte pas ca --> on aura creer une nouvelle methode
	// les surcharges : methode c (classe mere et fille) - methode d (classe fille)
	// les redefinition : a- d - e - h -i -j -k l -m
	
	// 4- Miage : la fille appelle sa methode et qui return fille
	//  - Miage : we have casted the variable of first definition mere to fille et on a appller la methode miage dans fille qui return Miage
	//  - Mere_a: variable of type mere is calling its method a
	//  - Fille_a : variale of type mere is calling the redefined method a in class fille
	//  - Fille_a : variale of type mere is calling the redefined method a in class fille
	//  - Fille_a : even thaught we cast the variable as a mere but her signature is fille so it will return fille_a et fera appelle a la methode de la classe fille
	//	- Fille_b(Fille) : variable of type fille call method b in fille because the method is redefined
	//	- Mere_c : variable of type fille call method c in mere bcs the class fille didn't redefine that method with no parameters.
	//	- Fille_c(Mere) : variable  will call method in mere because La classe fille n'a pa redefinie la method c qui est dans mere.
	//	- Fille_c(Mere) :variable will call method in mere because La classe fille n'a pa redefinie la method c qui est dans mere.
	//	- Fille_c(Mere) :variable will call method in mere because La classe fille n'a pa redefinie la method c qui est dans mere.et prend l'argument as type mere
	//	- Fille_c(Fille) : variable fait appele a la method fille dans fille en luit passant l'argument de type fille, qui est une methode propre a la classe fille.
	//	-static Mere_d : variable of type mere is calling a method in class mere
	//	-static Mere_d : varable of type mere is calling a method in class mere
	//	- Mere_f : this method only exists in class mere
	//	- Mere_f : this method only exists in class mere
	//  - Fille_j : The variable of type m calls the method j that is redefined in class fille, so calls the redefined method instead of the method in class Mere
	//  - Fille_k : The variable of type m calls the method k that is redefined in class fille, so calls the redefined method instead of the method in class Mere
	//  - Fille_l : The variable of type m calls the method l that is redefined in class fille, so calls the redefined method instead of the method in class Mere
	//	- Fille_m : The variable of type m calls the method m that is redefined in class fille, so calls the redefined method instead of the method in class Mere
}
