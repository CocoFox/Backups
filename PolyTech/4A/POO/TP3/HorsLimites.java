package tp3;

public class HorsLimites extends ExceptionForte{
	private int indexERR;
	public HorsLimites(int index){
		indexERR = index;
	}
	public String toString(){
		return "Acces Hors Limites a l'index " + indexERR;
	}
	
}
