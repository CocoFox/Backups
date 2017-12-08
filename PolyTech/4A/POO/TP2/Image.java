package tp2;

import java.util.Comparator;

// Composite de L'interface Forme, peux donc contenir lui meme des Composites et des formes 
// implementant tous les methodes dessiner et deplacer

public class Image extends Forme implements Comparable<Image>, Comparator<Image>{
	//private Point o;
	private Forme formes[];
	private int nbFormes; // nombre de formes dans l'image
	private int index = -1;
	public Image(){
		super(new Point(0,0));
		o = new Point(0,0);
		formes = new Forme[10];
	}
	public Image(Point p){
		super(p);
		o = p;
		formes = new Forme[10];
	}
	public void ajouter(Forme f){
		formes[++index] = f;
		nbFormes++;
	}
	
	public Forme retirer(){
		nbFormes--;
		return formes[index--];
	}
	
	public void dessiner(Piletransformations piletf){
		System.out.println("Image contient: {\n");
		for (Forme f : formes){
			if (f != null)
				f.dessiner(piletf);
		}
		System.out.println("}");
	}
	
	public void afficher(){
		System.out.println("Image contient: {\n");
		for (Forme f : formes){
			if (f != null)
				f.afficher();
		}
		System.out.println("}");
	}
	
	public void deplacerSpecifique(Point p){
		for (Forme f : formes){
			if (f != null)
				f.deplacer(p);
		}
		o = o.additionner(p);
	}
	public int compareTo(Image o){
		if(nbFormes > o.nbFormes)
			return 1;
		else if (nbFormes < o.nbFormes)
			return -1;
		else return 0;
	}
	public int compare(Image o1, Image o2){
		if(o1.o.getY() > o2.o.getY())
			return 1;
		else if (o1.o.getY() < o2.o.getY())
				return -1;
		else return 0;
	}
	
}
