package innova4b.ejemploCoche;

public class Coche {
	
	private Integer id;
	private String marca;
	private String modelo;
	
	@Override
	public String toString() {
		return "COCHE "+id+" Marca: "+marca+" Modelo: "+modelo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
