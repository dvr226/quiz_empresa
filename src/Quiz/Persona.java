package Quiz;

import java.util.Scanner;

public class Persona {
	protected String nombre;
	protected int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarinformacion()
	{
		System.out.println("\nEl nombre es: "+ nombre);
		System.out.println("La edad es: "+ edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
	public void responderPreguntas() {
		Scanner leer = new Scanner(System.in);
		
		//1
		leer.nextLine();
		System.out.println("\n1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
		System.out.println("La diferencia es que en la clase Persona se crean los atributos y metodos para esta clase (nombre, persona),"
	    		+"en cambio en la clase Empleado se heredan los atributos de Persona y se le añaden nuevos atributos y metodos especificos de esta clase");
	    
	    //2
	    leer.nextLine();
	    System.out.println("\n2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	    System.out.println("Despues de haber creado la Superclase, en la subclase se coloca la palabra reservada -extends-, asi la clase hija hereda los atributos"
	    		+" y metodos");
	    
	    //3
	    leer.nextLine();
	    System.out.println("\n3. ¿Qué es un constructor en Java y cuál es su propósito?");
	    System.out.println("Es un metodo que se utiliza al crear un objeto de una clase, que se utiliza para inicializar los atributos de ese objeto con distintos parametros");

	    //4
	    leer.nextLine();
	    System.out.println("\n4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
	    System.out.println("Principalmente si una clase va a tener los mismo atributos y metodos que otra, se hereden para que la clase hija la pueda utilizar, se puede reutilizar el codigo"
	    		+"hace que el codigo se ve mas organizado y sea mas facil de leer");
	    
	    //5
	    leer.nextLine();
	    System.out.println("\n5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
	    System.out.println("Constructor, se coloca la clase, el nuevo objeto y la palabra reservada -new-");
	    
	}

}
