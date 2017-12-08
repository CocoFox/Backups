package tp2;

import java.util.Arrays;

public class Main {

	public static void print(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		//5)
		System.out.println("5)");
		Segment s1 = new Segment(new Point(0,0),new Point(1,1));
		Cercle c1 = new Cercle();
		Point p1 = new Point(2,3);
		Piletransformations piletf = new Piletransformations(100);
		
		piletf.empiler(p1);
		
		s1.dessiner(piletf);
		c1.dessiner(piletf);
		
		Image im = new Image();
		im.ajouter(s1);
		im.ajouter(c1);
		im.dessiner(piletf);

		im.deplacer(piletf.getTransformation());
		im.dessiner(piletf);
		piletf.depiler();

		
		//6)
		
		System.out.println("6)");
		Segment s2 = new Segment(new Point(),new Point(3,9));
		Segment s3 = new Segment(new Point(),new Point(-2,2));
		Cercle c2 = new Cercle(new Point(9,3),6);
		Cercle c3 = new Cercle(new Point(),7);
		Point p2 = new Point(4,4);
		Image im2 = new Image();
		Image im3 = new Image();
		Image im4 = new Image();
		// reutilisation de la pile precendente
		
		piletf.empiler(p2);
		im2.ajouter(s2);
		im2.ajouter(c2);
		im3.ajouter(s3);
		im3.ajouter(c3);
		
		im2.dessiner(piletf);
		im3.dessiner(piletf);
		
		im4.ajouter(im2);
		im4.ajouter(im3);
		im4.dessiner(piletf);
		piletf.depiler();
		//7
		
		/*
		 * Cet exercice nous a permis d'implementer le patron Template method
		 * il a pour but de definir une structure (ou squelette) d'une fonction
		 * dont certaines etapes peuvent varier par Classes
		 */
		im4.deplacer(p2); // le code varie pour les elements de L'Image
		
		
		//8)
		
		System.out.println("8)");
		Structure structure[] = new Structure[2];
		structure[0] = new Entiers(10);
		structure[1] = new Liste();
		
		int tab[] = {1,2,-1,6,-7,-6,4,12};
		for (int e : tab)
			for (Structure s : structure)
				s.inserer(e);
		Compactable cStructure[] = new Compactable[2];
		cStructure[0] = structure[0];
		cStructure[1] = structure[1];
		for (Compactable s : cStructure)
			s.compacter(3);
		
		//9)
		
		for (Structure s : structure)
			s.afficher();
		
		
		
		
		
		
		
		//11
		Image imR[] = new Image[10];
		
		// remplire
		
		//Arrays.sort(imR);
		
		
		print("%#%#%");
		
		
		
	}

}
