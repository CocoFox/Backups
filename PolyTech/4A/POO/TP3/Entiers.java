package tp3;

public class Entiers {
	private int [] tab;
	private int taille;
	private int nbElem;
	
	public Entiers(int taille_init){
		taille = taille_init;
		nbElem = 0;
		tab = new int[taille_init];
	}
	
	public void inserer(int elem){
		if(nbElem == 0){
			tab[0] = elem;
			nbElem++;
		}// premiere insertion 
		
		else{
			if (nbElem+1 == taille)
				return;
			boolean found = false;
			boolean placefound = false;
			int i = 0;
			while( i < nbElem && !found && !placefound)
			{
				if(tab[i] == elem)
					found = true;
				if(tab[i] > elem)
					placefound = true;	
				i++;
			}
				
			if(!placefound && !found && i == nbElem){
				tab[nbElem++] = elem;// si on a parcouru tout le tableu l'element doit etre insere a nbElem
				return;
			}
			i--;
			
			if(found)
				return;
			else{
				for (int j = nbElem; j > i ;j--)
					tab[j] = tab[j-1];
			}
			tab[i] = elem;
			nbElem++;
			
		}
			
		
	}
	public void supprimer(int elem){
		int index = -1 ;
		for (int i = 0 ; i< nbElem; i++){
			if (tab[i] == elem)
				index = i;
		}
		if (index == -1)
			//
		for (int i = index; i < taille-1; i++)
		{
			tab[i]= tab[i+1];
		}
		tab[taille-1] = 0;
		nbElem--;
	}
	
	
	public void afficher(){
			System.out.println("Entiers:");
			for (int i = 0; i < nbElem;i++)
				System.out.println(tab[i]);
	}
	
	public void compacter(int del){
		for (int i = 0; i < taille-3; i++)
		{
			tab[i] = tab[i+3];
		}
		nbElem = nbElem - 3;
	}
	
	
	
	
}