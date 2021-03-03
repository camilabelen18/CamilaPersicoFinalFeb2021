package apellido.nombre;

public abstract class Vehiculo {
	
	private String Patente;
	
	public Vehiculo(String patente) {
		
		Patente = patente;
	}
	

	public abstract String getTipo();

	//ME FALTO
	
	public String getPatente() {
		return Patente;
	}


	public void setPatente(String patente) {
		Patente = patente;
	}
	

	
	

}
