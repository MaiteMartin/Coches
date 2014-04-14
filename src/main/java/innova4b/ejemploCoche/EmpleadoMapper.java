package innova4b.ejemploCoche;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpleadoMapper implements RowMapper<Empleado> {

	public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empleado empleado = new Empleado();
		empleado.setId(rs.getInt("id"));
		empleado.setNombre(rs.getString("nombre"));
		empleado.setApellido(rs.getString("apellidos"));
		empleado.setIdCoche(rs.getInt("idcoche"));
		
		return empleado;
	}
	
	

}
