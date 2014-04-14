package innova4b.ejemploCoche;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmpleadoRepo {
	
	private JdbcTemplate jdbcTemplate;
	
	public EmpleadoRepo(DriverManagerDataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}

	public List<Empleado> findAll() {
		List<Empleado> empleados = jdbcTemplate.query("select * from empleado", new EmpleadoMapper());	
		System.out.println(empleados);
		return empleados;
	}
	
	public Empleado getEmpleado(int idEmpleado) {
		Object[] parameters = new Object[] {idEmpleado};		
		Empleado empleado = jdbcTemplate.queryForObject("select * from empleado where id= ?",
		        parameters, new EmpleadoMapper());	
		return empleado;
	}

	
	/*
	 * Devuelve el idCoche si tiene el coche reservado, un -1 en caso contrario
	 */
	public int empleadoHasCocheBooked(Integer idEmpleado){
		int resultado;
		Object[] parameters = new Object[] {idEmpleado};
	    Integer idCoche = jdbcTemplate.queryForObject("select idcoche from empleado where id= ?",
	        parameters, Integer.class);
	    if (idCoche == null){
	    	resultado = -1;
	    }
	    else{
	    	resultado = idCoche;
	    }
		return resultado;
	}
	

	public void asignaCocheEmpleado(Integer idEmpleado, Integer idCoche)
	{
		
		String query = "update empleado set idCoche="+ idCoche+" where id="+idEmpleado;
		jdbcTemplate.update(query);
	}

}
