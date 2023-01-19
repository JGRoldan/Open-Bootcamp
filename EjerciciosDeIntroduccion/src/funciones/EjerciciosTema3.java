package funciones;

public class EjerciciosTema3 {

	public static void main(String[] args) {
		
		Suma suma = new Suma();
		System.out.println(
                "Sumar 3 numeros en la funcion SUMA\n" +
                "Valores que se pasan por parametos 1, 2, 3"
        );

		System.out.println("Resultado: " + suma.suma(1, 2, 3));
		
		System.out.println("\n*************************");
		System.out.println("Obtener el numero de puertas de la clase COCHE\n");
		Coche coche = new Coche(4);
		System.out.println("Puertas antes: " +coche.getPuertas());
		coche.setPuertas();
		System.out.println("Puertas despues: " +coche.getPuertas());

	}

}
