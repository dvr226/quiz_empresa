package Quiz;

import java.util.Scanner;

public class Aplicacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		Persona persona1 = new Persona(null, 0);
		System.out.println("Ingrese el nombre");
		persona1.setNombre(leer.nextLine());
		System.out.println("Ingrese la edad");
		persona1.setEdad(leer.nextInt());
		
		persona1.mostrarinformacion();
		
		Empleado empleado1 = new Empleado(persona1.getNombre(), persona1.getEdad(), 0, null);
		System.out.println("\nIngrese el salario");
		empleado1.setSalario(leer.nextDouble());
		System.out.println("Ingrese el cargo");
		empleado1.setCargo(leer.next());
		
		empleado1.mostrarinformacion();
		
		System.out.println("Ingrese enter para ver cada pregunta");
		
		Persona info = new Persona (null, 0);
		info.responderPreguntas();
	}


}
