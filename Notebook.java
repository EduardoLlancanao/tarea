package tarea;

public class Notebook extends Computador{
	
	Boolean touchPad;
	Boolean gamer;
	int pul_pantalla;
	
	public Notebook() {
		
	}
	
	public Notebook(Boolean touchPad, Boolean gamer) {
		super();
		this.touchPad = touchPad;
		this.gamer = gamer;
	}
	
	public Boolean gettouchPad() {
		return touchPad;
	}

	public void settouchPad(Boolean touchPad) {
		this.touchPad = touchPad;
	}
	
	public Boolean getgamer() {
		return touchPad;
	}

	public void setgamer(Boolean gamer) {
		this.gamer = gamer;
	}
	
	public int getpul_pantalla() {
		return pul_pantalla;
	}

	public void setpul_pantalla(int pul_pantalla) {
		this.pul_pantalla = pul_pantalla;
	}

}
