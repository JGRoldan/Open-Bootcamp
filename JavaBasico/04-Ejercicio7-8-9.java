package ejercicio;

import java.io.*;
import java.util.*;


public class Ejercicio7_8_9 {

	public static void main(String[] args) {
		
	    System.out.println("Ingrese una palabra: ");
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Palabra ingresada: " + str);
        System.out.println("Palabra invertida: " + reverse(str));
		
		
		String [] array = {"Hola","desde","openBootcamp",};
        simpleArray(array);
		
		int [][] matriz = new int [2][4];
		matriz(matriz);
		
		System.out.println(vector());
		
		arrayList();
		removePAR();
		
		
        int num1 = 1;
        int num2 = 0;

        try {
            System.out.println("Division: " + num1+ "/" + num2 + " es: " + division( num1, num2));
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse " + e);
        }finally {
            System.out.println("Demo de código");
        }
        
        String fileIn = "fileIn.txt";
        String fileOut = "fileOut.txt";
        copyFile(fileIn, fileOut);
	}
	
	//REVERSE STRING
	public static String reverse(String texto) { 
		char charTxt;
		String reverseTxt = "";
		for (int i=0; i<texto.length();i++) {
			charTxt = texto.charAt(i);
			reverseTxt  = charTxt + reverseTxt;
		}
		return reverseTxt;
	}
	
	//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
	public static void simpleArray(String [] array) { 
		
		for (int i = 0; i<array.length;i++) {
			System.out.println("Index: " + i + ", contenido: " +array[i]);
		}
	}
	
	//Crea un array bidimensional de enteros y recórrelo, mostrando la posición 
	//y el valor de cada elemento en ambas dimensiones.
	
	public static void matriz(int [][] matriz) { 
		for (int i = 0; i<matriz.length;i++) {
			System.out.println("Fila: " + i);
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
		}
	}
	
	//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
	//Elimina el 2o y 3er elemento y muestra el resultado final.
	
	public static Vector vector() { 
		Vector <Integer> miVector = new Vector<>();
		miVector.add(1);
		miVector.add(2);
		miVector.add(3);
		miVector.add(4);
		miVector.add(5);
		miVector.add(6);
		
		miVector.remove(2);
		miVector.remove(3);
		
		return miVector;
		
		//Si el vector llega a su capacidad maxima => cambia la capacidad al doble de lo maximo (miVector.capacity()*2)
	}
	
	
	//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. 
	//Recorre ambos mostrando únicamente el valor de cada elemento.
	
	public static void arrayList() { 
		ArrayList <String> miArrayList = new ArrayList<String>();
		miArrayList.add("Curso");
		miArrayList.add("basico");
		miArrayList.add("de");
		miArrayList.add("Java");
		
		System.out.println("miArrayList:");
		
		for (String arrayList : miArrayList) {
			System.out.println("Valores arrayList: " + arrayList);			
		}
		
		
		System.out.println("linkedList:");
		LinkedList <String> miLinkedList = new LinkedList<String>();
		
		for (String arrayList : miArrayList) {
			miLinkedList.add(arrayList);
			System.out.println("Valores linkedList: " + arrayList);			
		}
		
	}
	
//	Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
//	A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, 
//	vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, 
//	siempre y cuando cumplas el primer "for" de relleno.

	public static void removePAR() { 
		ArrayList <Integer> miArrayList = new ArrayList<Integer>();
		
		for(int i=1; i<=10;i++) {
			miArrayList.add(i);
		}
		
		for(int i=0;i<miArrayList.size();i++) {
			if(miArrayList.get(i)%2==0) {
				miArrayList.remove(i);
			}
		}
		
		System.out.println(miArrayList);
		
	}
	
	
//	Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante 
//	del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). 
//	Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
//	Finalmente, mostraremos en cualquier caso: "Demo de código".
	
    private static int division(int num1, int num2) throws ArithmeticException{
        return num1 / num2;
    }
    
//    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
//    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en 
//    "fileOut".
    
    
    private static void copyFile(String fileIn, String fileOut){
    	
        try {
        InputStream in = new FileInputStream(fileIn);
        byte [] datos = in.readAllBytes();
        in.close();

        PrintStream out = new PrintStream(fileOut);
        out.write(datos);
        out.close();
        System.out.println("Archivo copiado");
        }catch (Exception e){
            System.out.println("Excepción:" + e.getMessage());
        }
    }
	
}