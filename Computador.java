package tarea;

public class Computador {
	
	String Modelo;
	String Marca;
	String Procesador;
	
	public Computador() {
		
	}
	
	public Computador(String Modelo, String Marca, String Procesador) {
		this.Modelo = Modelo;
		this.Marca = Marca;
		this.Procesador = Procesador;
	}
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getProcesador() {
		return Procesador;
	}

	public void setProcesador(String Procesador) {
		this.Procesador = Procesador;
	}
	
	
	

}
