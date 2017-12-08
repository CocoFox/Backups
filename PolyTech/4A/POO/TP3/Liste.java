package tp3;


public class Liste implements Cloneable {
	private ListNode teteListe;
	private ListNode iterator;
	
	public Liste(){
		teteListe = null;
	}
	public Liste(Liste l){
		teteListe = new ListNode(l.teteListe);
	}
	
	public void inserer(int elem){
		if (teteListe == null){
			teteListe = new ListNode(elem);
			return;
		}
		if (teteListe.getData() == elem)
			return;
		iterator = teteListe;
		while(iterator.hasNext()){
			if (iterator.getNext().getData() == elem) // si l'element est deja present 
				return;
			iterator = iterator.getNext();
		}
		iterator.setNext(new ListNode(elem));
	}
	public void supprimer(int elem){
		if (teteListe == null)
			return;
		
		iterator = teteListe;
		if (iterator.getData() == elem){
			teteListe = iterator.getNext(); // si l'element se trouve en tete de liste
			return;
		}
		
		while(iterator.hasNext()){
			if (iterator.getNext().getData() == elem){
				ListNode newNext = iterator.getNext().getNext();
				iterator.getNext().setNext(null);
				iterator.setNext(newNext);
				return;
			}
			iterator = iterator.getNext();
		}
		
	}
	
	public void afficher(){
		if (teteListe == null){
			System.out.println("Liste Vide");
			return;
		}
			
		iterator = teteListe;
		System.out.println("Liste:");
		System.out.println(iterator.getData()); // afficher l'element en tete de liste
		
		while(iterator.hasNext()){
			System.out.println(iterator.getNext().getData());
			iterator = iterator.getNext();
		}
		System.out.println("--");
	}
	public void compacter(int del){
		iterator = teteListe;
		for (int i = 0; i < del; i++){
			ListNode newNext = iterator.getNext().getNext();
			iterator.getNext().setNext(null);
			iterator.setNext(newNext);
			iterator.getNext();
		}
	}
	public Liste clone(){
		Liste clone = new Liste();
		if (teteListe == null)
			return null;
		iterator = teteListe;
		teteListe = new ListNode(iterator.getData());
		while(iterator.hasNext())
			clone.inserer(iterator.getData());
		return clone;
	}

}
