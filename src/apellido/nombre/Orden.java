package apellido.nombre;

import java.util.Comparator;

public class Orden implements Comparator<Cabina>{

	@Override
	public int compare(Cabina o1, Cabina o2) {
		// TODO Auto-generated method stub
		return o1.getNumero()-o2.getNumero();
	}



}
