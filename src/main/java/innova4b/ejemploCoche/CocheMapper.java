package innova4b.ejemploCoche;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class CocheMapper implements RowMapper<Coche>  {

		public Coche mapRow(ResultSet rs, int rowNum) throws SQLException {
			Coche coche = new Coche();
			coche.setId(rs.getInt("id"));
			coche.setMarca(rs.getString("marca"));
			coche.setModelo(rs.getString("modelo"));		
			return coche;
		}

}
