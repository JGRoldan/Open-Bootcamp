package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocheCRUDImpl coche1 = new CocheCRUDImpl("HOLA");
		CocheCRUDImpl coche2 = new CocheCRUDImpl("SOY");
		CocheCRUDImpl coche3 = new CocheCRUDImpl("UN");
		CocheCRUDImpl coche4 = new CocheCRUDImpl("AUTO");
		
		coche1.save(coche1);
		coche1.save(coche2);
		coche1.save(coche3);
		coche1.save(coche4);
		
		
		for (CocheCRUDImpl c: coche1.lista) {
			System.out.println(c.marca);
		}
	}

}
