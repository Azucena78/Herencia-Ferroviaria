package com.cursoceat.model;

public class Empleado_Superclase {
	private static int id;
	protected String nombre;
	protected String dni;
	protected String telefono;
	protected double sueldo;
	private int idlocal;
	
	public Empleado_Superclase() {
		this.idlocal = asignarID(); //creaamos un oonstructor y le asignamos un id
	}

	public Empleado_Superclase(String nombre, String dni, String telefono, double sueldo, int idlocal) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.idlocal = asignarID(); //constructor con todos los datos y asignamos id
	}
	private static int asignarID() {
		return ++id;
	}
	public static int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public void mostrarDatos() {
		System.out.println("El id es: " +this.idlocal);
		System.out.println("El Nombre es: " +this.nombre);
		System.out.println("El Dni es: " +this.dni);
		System.out.println("El Teléfono es: " +this.telefono);
		System.out.println("El Sueldo es: " +this.sueldo);
	}
	
}
