package ejercicio;

public class Ejercicio3 {

	public static void main(String[] args) {
		
        String[] nombres = {"Juan", "Gaston", "Maria", "Rocio"};
        String concatenar="";
        
        for(String name : nombres){
            concatenar += name + ',';
            System.out.println(concatenar.substring(0,concatenar.length()-1));
        }
	}

}