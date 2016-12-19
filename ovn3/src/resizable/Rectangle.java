package resizable;

// H�r l�ggs allts� till "implements Resizable" uppgift U 20
public class Rectangle implements Resizable {
	private double height;
	private double width;

	public Rectangle(double h, double w) {
		height = h;
		width = w;
	}

	public String toString() {
		return "Height: " + height + " width: " + width;
	}
	//h�r implementeras downSize U 20
	public void downSize(int scaleFactor){
		if(scaleFactor<=0){
			//felmeddelande som man skulle skriva i U21. Tror att de har skrivit fel i uppgiften och egentligen
			//menar >0 f�r fall man delar p� noll g�r v�rlden s�nder och varf�r ska skalfaktorn g�ra talet negativt?
			throw new IllegalArgumentException("Ogiltigt v�rde p� skalfaktorn" + scaleFactor);
		}
		else{

			// Skrev s� h�r ursprungligen f�r brukar skriva s� h�r
			//this.height=this.height/scaleFactor;
			// Men m�ste b�rja skriva s� h�r ist�llet
			this.height/=scaleFactor;
			this.width/=scaleFactor;
		}
	
	}
	
	

}
