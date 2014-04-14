package innova4b.ejemploCoche;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CocheRepo {
	
	private JdbcTemplate jdbcTemplate;
	
	public CocheRepo(DriverManagerDataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}

	public List<Coche> findAll() {
		List<Coche> coches = jdbcTemplate.query("select * from coche", new CocheMapper());	
		System.out.println(coches);
		return coches;
	}
	
	public boolean isCocheBooked(Integer idCoche)
	{
		boolean resultado = false;
		Object[] parameters = new Object[] {idCoche};
	    Integer isBooked = jdbcTemplate.queryForObject("select count(*) from empleado where idcoche= ?",
	        parameters, Integer.class);
	    resultado = isBooked>0;
		return resultado;
	}

}
