package tp2;

public class Piletransformations {
	private Point pile[];
	private int index;
	
	public Piletransformations(int taille){
		pile = new Point[taille];
		index = -1;
	}
	public Point getTransformation(){
		if (index == -1)
			return null;
		return pile[index];
	}
	
	public void empiler(Point p){
		if (index == -1)
			pile[++index] = p;
		else
			pile[index++] = new Point(p.getX() + pile[index].getX(),p.getY() + pile[index].getY());
	}
	public void depiler(){
		if (index != -1)
			index--;
	}
}
