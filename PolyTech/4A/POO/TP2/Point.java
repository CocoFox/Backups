package tp2;

public class Point {
	private int x;
	private int y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p){
		x = p.getX();
		y = p.getY();
	}
	
	public Point additionner(int x, int y){
		return new Point(this.x + x,this.y + y);
	}
	public Point additionner(Point p){
		return new Point(this.x + p.getX(), this.y + p.getY());
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}