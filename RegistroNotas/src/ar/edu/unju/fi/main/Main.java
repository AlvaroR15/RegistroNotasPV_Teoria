package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno,1);
	}

	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo del alumno:");
		Integer legajoAlumno = scanner.nextInt();
		System.out.println("Ingrese el nombre del alumno:");
		String nombre = scanner.next();
		System.out.println("Ingrese el apellido del alumno:");
		String apellido = scanner.next();
		
		alumno.setLegajo(legajoAlumno);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i < numMaterias) {
			// Solicitar datos de materias
			System.out.println("Ingrese el código de la materia:");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia:");
			String nombreMateria = scanner.next();
			
			// Cargar materias
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			// Solicitar datos de nota
			System.out.println("Ingrese el código del registro de nota:");
			String codigoNota= scanner.next();
			System.out.println("Ingrese la nota final:");
			Float nota = scanner.nextFloat();
			
			// Cargar notas
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);

			// Mostrar datos
			System.out.println(registroNota.toString());
			i++;
		}
		scanner.close();
	}
}
