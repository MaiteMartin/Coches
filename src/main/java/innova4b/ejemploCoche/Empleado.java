package innova4b.ejemploCoche;

public class Empleado {

	private Integer id;
	private String nombre;
	private String apellido;
	private Integer idCoche;
	
	@Override
	public String toString() {
		return "EMPLEADO "+id+" Nombre: "+nombre+" Coche:"+idCoche;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getIdCoche() {
		return idCoche;
	}
	public void setIdCoche(Integer idCoche) {
		this.idCoche = idCoche;
	}
}
