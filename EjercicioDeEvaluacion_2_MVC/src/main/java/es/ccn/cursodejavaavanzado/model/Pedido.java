package es.ccn.cursodejavaavanzado.model;

public class Pedido {
	
	private String articulo;
	private Double precio;
	
	public Pedido() {
		
	}
	

	
	public String getArticulo() {
		return articulo;
	}
	
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
