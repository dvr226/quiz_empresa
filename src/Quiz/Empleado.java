package Quiz;

public class Empleado extends Persona{
	double salario;
	String cargo;
	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		this.salario = salario;
		this.cargo = cargo;	
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void mostrarinformacion()
	{
		System.out.println("\nEl nombre es: "+ this.getNombre());
		System.out.println("La edad es: "+ this.getEdad());
		System.out.println("El salario es: "+ this.getSalario());
		System.out.println("El cargo es: "+ this.getCargo ());
	}
}
