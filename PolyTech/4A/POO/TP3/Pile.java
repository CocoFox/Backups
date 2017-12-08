package tp3;

public class Pile {
	private int taille;
	private int nbElem;
	private int pile[];
	
	/** Constructeur de la Pile
	 * 
	 * @param taille_init la taille maximale de la pile
	 */
	public Pile(int taille_init){
		nbElem = 0;
		taille = taille_init;
		pile = new int[taille_init];
		
	}
	/** methode pour empiler un element 
	 * 
	 * @param elem element a ajouter dans la pile
	 */
	public void empiler(int elem){
		if (pleine()){
			System.out.println("ERR: Pile pleine");
			return;
		}
		pile[nbElem] = elem;
		nbElem++;
	}
	/** methode pour depiler l'element en tete de pile
	 * 
	 * @return l'element en tete de pile
	 */
	public int depiler() throws PileVide{	
		if (vide()){
			throw new PileVide(); 
		}
		int top = pile[nbElem-1];
		nbElem--;
		return top;
	}
	/** methode indiquant si la pile est vide
	 * 
	 * @return boolean 
	 */
	public boolean vide(){
		return nbElem==0;
	}
	/** methode indiquant si la pile est pleine
	 * 
	 * @return boolean 
	 */
	public boolean pleine(){
		return nbElem == taille;
	}
			
}
