package Interface;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

	String marca;
	
	public CocheCRUDImpl(String marca) {
		this.marca = marca;
	}
	
	List<CocheCRUDImpl> lista = new ArrayList<>();
	
	@Override
	public void save(CocheCRUDImpl coche) {
		// TODO Auto-generated method stub
		lista.add(coche);
	}

	@Override
	public List<CocheCRUDImpl> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CocheCRUDImpl coche) {
		// TODO Auto-generated method stub
		
	}

}
