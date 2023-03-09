package com.cursoceat.model;

public class Maquinista extends Empleado_Superclase {
	private String rango;
	
	public Maquinista(String rango) {
		this.rango = rango;
	}
	public Maquinista(String nombre, String dni, String telefono, double sueldo, int idlocal, String rango) {
		super(nombre, dni, telefono, sueldo, idlocal);
		this.rango = rango;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("El rango es: " + this.rango);
	}
	
}
