package tp2;

public class Segment extends Forme implements Cloneable{
	private Point p1;
	private Point p2;
	
	public Segment(Point p1,Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public Segment(){
		p1 = new Point();
		p2 = new Point();
	}
	
	public Point getP1(){
		return p1;
	}
	public Point getP2(){
		return p2;
	}
	
	public void setP1(Point p){
		p1 = p;
	}
	public void setP2(Point p){
		p2 = p;
	}
	
	public void dessiner(Piletransformations piletf){
		Point t = piletf.getTransformation(); // t pour translation
		Point nouvP1 = p1.additionner(t);
		Point nouvP2 = p2.additionner(t);
		System.out.println(this + " aura comme nouveux coordonnees : [" + nouvP1 + "," + nouvP2 + "]");
	}
	
	
	public void deplacerSpecifique (Point p){
		p1 = p1.additionner(p);
		p2 = p2.additionner(p);
	}
	
	public String toString(){
		return ("Segment : [" + p1.toString() + "," + p2.toString() + "]");
	}
	public void afficher(){
		System.out.println(this);
	}
	public Segment clone(){
		Point np1 = new Point(p1);
		Point np2 = new Point(p2);
		Segment clone = new Segment(np1,np2);
		return clone;
	}
	
	
}
