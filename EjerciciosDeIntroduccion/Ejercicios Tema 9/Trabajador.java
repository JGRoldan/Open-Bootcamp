package persona2;

public class Trabajador extends Persona{

	private int salario;
	public Trabajador(String nombre, int edad, int telefono) {
		super(nombre, edad, telefono);
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Salario de "+getNombre() +" "+ salario;
	}
	

}
