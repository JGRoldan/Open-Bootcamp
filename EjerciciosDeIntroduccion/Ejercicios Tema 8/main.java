package persona;

public class main {

	public static void main(String[] args) {
		
		Persona persona1=new Persona(null, 0, 0);
		persona1.setNombre("Gaston");
		persona1.setEdad(27);
		persona1.setTelefono(123456789);

		System.out.println(persona1.toString());
	}

}
