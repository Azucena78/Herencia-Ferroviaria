package main;

import java.util.ArrayList;

import com.cursoceat.model.Empleado_Superclase;
import com.cursoceat.model.JefeEstacion;
import com.cursoceat.model.Locomotora;
import com.cursoceat.model.Maquinista;
import com.cursoceat.model.Mecanico;
import com.cursoceat.model.Mecanico.ESPECIALIDAD;
import com.cursoceat.model.Tren;

public class Main {

	public static void main(String[] args) {
		ArrayList<Empleado_Superclase> misEmpleados = new ArrayList<Empleado_Superclase>();
		Mecanico unMecanico = new Mecanico("José", "06447896", "658987456", 1000, 012, ESPECIALIDAD.FRENOS);
		misEmpleados.add(unMecanico);
		//unMecanico.mostrarDatos();
		//system.out.println(unMecanico.toString);
		Maquinista unMaquinista = new Maquinista("Pedru", "06546987", "654789654", 1200, 033, "Jefe Sección");
		misEmpleados.add(unMaquinista);
		//unMaquinista.mostrarDatos();
		JefeEstacion unJefeEstacion = new JefeEstacion("Petra", "067896541", "654789632", 1234,89);
		misEmpleados.add(unJefeEstacion);
		JefeEstacion unJefeEstacion2 = new JefeEstacion("Azucena", "067566541", "654789614", 2334,98);
		misEmpleados.add(unJefeEstacion2);
		//muestro en este momento lo que tengo en mis empleados
		for (Empleado_Superclase e:misEmpleados) {
			e.mostrarDatos();
		}
	    //****************************
		System.out.println("***********Desde aquí ejecutamos Maquinaria**************");
		Locomotora unaLocomotora = new Locomotora("065781M", 1500, 2005, unMecanico);
		System.out.println(unaLocomotora.toString());
		System.err.println("***************************************************");
		Tren miTren = new Tren(unaLocomotora, unMaquinista);
		miTren.agregarVagon(30000, 15000, "Bombillas");
		miTren.mostrarTren();
	}

}
