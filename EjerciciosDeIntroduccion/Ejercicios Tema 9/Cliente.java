package persona2;

public class Cliente extends Persona{

	private int credito;
	
	public Cliente(String nombre, int edad, int telefono) {
		super(nombre, edad, telefono);
	}
	
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Credito obtenido: " + credito +" \n"+ super.toString();
	}
	

}
