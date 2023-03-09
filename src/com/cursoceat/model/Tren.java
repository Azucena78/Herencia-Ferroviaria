package com.cursoceat.model;
import java.util.Arrays;

public class Tren {
	Locomotora locomotora;
	Vagon[] vagones;
	Maquinista maquinista;
	private int numVagones;
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		this.numVagones = 0;
	}
	public void agregarVagon(int cargaMax, int cargaActual, String mercancia){
		if (this.numVagones >= 5) {
			System.out.println("No se puede agragar más vagones");
		}else {
			Vagon v = new Vagon(this.numVagones, cargaMax, cargaActual, mercancia); //aqui creo un vagon
			vagones[numVagones] = v;
			++this.numVagones;
		}
	}
		public void mostrarTren() {
			System.out.println("El tren tiene " + numVagones + " vagones.");
			System.out.println("Los vagones tienen: ");
			
			for (Vagon va:vagones) {
				if (va == null) {
					break;
				}else {
					System.out.println("Carga Actual: " + va.getCargaActual());
					System.out.println("Carga Máxima: " + va.getCargaMax());
					System.out.println("Mercancia: " + va.getMercancia());
					System.out.println("Maquinista: " + maquinista.getNombre());
					System.out.println("Matrícula de la locomotora: " + locomotora.getMatricula());
				}
			}
		}
	}
