package tarea;

public class PcEscritorio extends Computador {
	
	Boolean todoEnUno;
	
	public PcEscritorio() {
		
	}
	
	public PcEscritorio(Boolean todoEnUno) {
		super();
		this.todoEnUno = todoEnUno;
	}
	
	public Boolean gettodoEnUno() {
		return todoEnUno;
	}

	public void settodoEnUno(Boolean todoEnUno) {
		this.todoEnUno = todoEnUno;
	}
	
}
