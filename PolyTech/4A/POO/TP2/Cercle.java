package tp2;

public class Cercle extends Forme {
		//o (herite) decris le point d'origine-
	private int r; // decris le rayon du cercle
	
	public Cercle(Point o , int r){
		this.setO(o);
		this.setR(r);
	}
	public Cercle(){
		o = new Point();
		r = 1;
	}
	
	public void dessiner(Piletransformations piletf){
		Point p = piletf.getTransformation();
		Point nouvOrigine = p.additionner(o);
		System.out.println( this  + "aura comme nouvelle origine " + nouvOrigine);
	}
	
	public void deplacerSpecifique (Point p){
		// fait dans la super-classe
	}

	public Point getO() {
		return o;
	}
	public void setO(Point o) {
		this.o = o;
	}

	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public String toString(){
		return ("Cercle d'origine " + o.toString() + " et de rayon " + r + " ");
	}
	public void afficher(){
		System.out.println(this);
	}
	
}
