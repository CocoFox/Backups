package tp2;

public abstract class Forme implements Affichable { 
	protected Point o;
	public abstract void dessiner(Piletransformations piletf);
	public Forme(){
		o = new Point(0,0);
	}
	public Forme(Point p){
		o=p;
	}
	void deplacer (Point p){
		o = o.additionner(p);
		deplacerSpecifique(p);
	}
	public abstract void deplacerSpecifique(Point p);
	
}
