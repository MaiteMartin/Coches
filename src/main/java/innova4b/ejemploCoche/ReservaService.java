package innova4b.ejemploCoche;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ReservaService {
	private EmpleadoRepo empleadoRepo;
	
	public ReservaService(EmpleadoRepo empleadoRepo){
		this.empleadoRepo = empleadoRepo;
	}
	
	public boolean reservaCoche(Integer idEmpleado, Integer idCoche){
		boolean resultado = false;
		int coche = empleadoRepo.empleadoHasCocheBooked(idEmpleado);
		
		if (coche ==-1)
		{
			empleadoRepo.asignaCocheEmpleado(idEmpleado, idCoche);
			resultado = true;
		}
		else
		{
			System.out.println("El empleado tiene reservado el coche "+coche);
		}
		return resultado;
	}
	
	
}
