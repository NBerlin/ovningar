package resizable;

// Här läggs alltså till "implements Resizable" uppgift U 20
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
	//här implementeras downSize U 20
	public void downSize(int scaleFactor){
		if(scaleFactor<=0){
		// Skrev så här ursprungligen för brukar skriva så här
		//this.height=this.height/scaleFactor;
		// Men måste börja skriva så här istället
		this.height/=scaleFactor;
		this.width/=scaleFactor;
		}
		else{
			//felmeddelande som man skulle skriva i U21. Tror att de har skrivit fel i uppgiften och egentligen
			//menar >0 för fall man delar på noll går världen sönder och varför ska skalfaktorn göra talet negativt?
			System.out.println("Du behöver ett tal som är <=0");
		}
	}
	

}
