package lacteos;

public class Quesos {
	private String tipo_leche;
	private int cantidad_leche;
	private double peso;
	
	public Quesos(String tipo_leche, int cantidad_leche, double peso) {
		this.setTipo_leche(tipo_leche);
		this.setCantidad_leche(cantidad_leche);
		this.setPeso(peso);
	}
	public Quesos() {
	}
	
	/**
	 * @return the tipo_leche
	 */
	public String getTipo_leche() {
		return tipo_leche;
	}
	/**
	 * @param tipo_leche the tipo_leche to set
	 */
	public void setTipo_leche(String tipo_leche) {
		this.tipo_leche = tipo_leche;
	}
	/**
	 * @return the cantidad_leche
	 */
	public int getCantidad_leche() {
		return cantidad_leche;
	}
	/**
	 * @param cantidad_leche the cantidad_leche to set
	 */
	public void setCantidad_leche(int cantidad_leche) {
		this.cantidad_leche = cantidad_leche;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
