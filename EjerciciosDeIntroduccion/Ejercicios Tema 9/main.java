package persona2;

public class main {

	public static void main(String[] args) {
		
		Cliente cliente=new Cliente(null, 0, 0);
		cliente.setNombre("Juan");
		cliente.setEdad(20);
		cliente.setTelefono(123456789);
		cliente.setCredito(5000);
		System.out.println(cliente.toString());
		
		Trabajador trabajador = new Trabajador(null, 0, 0);
		trabajador.setNombre("Mario");
		trabajador.setEdad(35);
		trabajador.setTelefono(123456789);
		trabajador.setSalario(10000);
		System.out.println(trabajador.toString());

	}

}
