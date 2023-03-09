package com.cursoceat.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JefeEstacion extends Empleado_Superclase {
	
	private LocalDateTime nombramiento;
	DateTimeFormatter formato1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.SHORT).withLocale(Locale.getDefault());
	
	public JefeEstacion() {
		this.nombramiento = LocalDateTime.now();
	}
	public JefeEstacion(String nombre, String dni, String telefono, double sueldo, int idlocal) {
		super(nombre, dni, telefono, sueldo, idlocal);
		this.nombramiento = LocalDateTime.now();
	}
	public LocalDateTime getNombramiento() {
		return nombramiento;
	}
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Fecha de nombramiento: "+this.nombramiento.format(formato1));
	}
}
