package tp3;

public class Main {

	public static void main(String[] args) {
		int tab[] = {3,4,-1,9,78,5,3,23,7,45,5,8,56,54,3,7,37,0};
		Pile pile = new Pile(20);
		Entiers entiers = new Entiers(20);
		for (int e : tab){
			pile.empiler(e);
			entiers.inserer(e);
		}
		entiers.inserer(-19);
		entiers.inserer(-123);
		entiers.inserer(420);
		entiers.inserer(-11);
		entiers.inserer(-100);
		entiers.inserer(300);
		entiers.inserer(-120);;
		
		try {
		for (int i = 0; i < 20 ; i++)
			pile.depiler();
		} catch (ExceptionForte e){
			System.err.println(e);
		}
	}

}
