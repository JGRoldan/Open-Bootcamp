package condicional;

public class main {

	public static void main(String[] args) {
		
// IF - ELSE
		
		int numeroIf = 15;
		
		if(numeroIf<0) System.out.println("El numero " + numeroIf + " es negativo");
		else if(numeroIf>0) System.out.println("El numero " + numeroIf + " es positivo");
		else System.out.println("El numero " + numeroIf + " es cero");
	
// WHILE

		int numeroWhile = 0;
		while (numeroWhile<3) {
			System.out.println("Iteracion WHILE " + numeroWhile);
			numeroWhile++;
		}
		
// DO WHILE
		
		int numeroDoWhile = 0;
		do {
			numeroDoWhile++;
		}
		while (numeroDoWhile<3);
		System.out.println(numeroDoWhile);
		
		
// FOR
		
		int numeroFor = 0;
		for (int i = 0; i <= 3; i++) {
			System.out.println("Iteracion FOR " + numeroFor);
			numeroFor++;
		}
		
// SWITCH
		String estacion = "invierno";
		switch (estacion) {
		case "verano":
			System.out.println("Estacion " + estacion);
			break;
			
		case "invierno":
			System.out.println("Estacion " + estacion);
			break;
			
		case "primavera":
			System.out.println("Estacion " + estacion);
			break;
			
		case "otoño":
			System.out.println("Estacion " + estacion);
			break;

		default:
			System.out.println("Estacion inexistente");
			break;
		}

	}

}
