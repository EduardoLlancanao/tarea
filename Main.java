package tarea;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		
		// Computador mipc = new Computador();
		
		// Notebook miNote = new Notebook();
		// Notebook miNote2 = new Notebook(true,true);
		
		// PcEscritorio pc = new PcEscritorio();
		// PcEscritorio pc1 = new PcEscritorio(true);
		
		
		Computador NuevoNotebook = new Notebook();
		Computador NuevoPcEscritorio = new PcEscritorio();
		
		
		System.out.println("ingrese Marca Del Notebook ");
		String sMarca = sc.next();
		NuevoNotebook.setMarca(sMarca);
				
		System.out.println("ingrese Procesador Del Pc - Escritorio ");
		String sProcesador = sc.next();
		NuevoPcEscritorio.setProcesador(sProcesador);
		
		System.out.println("Marca del Notebook : " + NuevoNotebook.getMarca());
		System.out.println("Procesador del Pc Escritorio : " + NuevoPcEscritorio.getProcesador());

	}

}
