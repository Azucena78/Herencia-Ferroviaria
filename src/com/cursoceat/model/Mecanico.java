package com.cursoceat.model;

public class Mecanico extends Empleado_Superclase {
	public enum ESPECIALIDAD{FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR} //visible
	private ESPECIALIDAD especialidad; //encapsulada
	
	public Mecanico() {
		super();	
	}
	public Mecanico(String nombre, String dni, String telefono, double sueldo, int idlocal, ESPECIALIDAD especialidad) {
		super(nombre, dni, telefono, sueldo, idlocal);
		this.especialidad = especialidad;
	}
	public ESPECIALIDAD getEspecialidad() {
		return especialidad;
	}
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Especialidad: " +this.especialidad);
	}
	@Override
	public String toString() {
		return "Mecanico [especialidad = " + especialidad + ", nombre = " + nombre + ", dni = " + dni + ", telefono = "
				+ telefono + ", sueldo = " + sueldo + "]";
	}
	
	
}
