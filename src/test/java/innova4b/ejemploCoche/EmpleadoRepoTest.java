package innova4b.ejemploCoche;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadoRepoTest {
	
	ApplicationContext context;
	EmpleadoRepo empleadoRepo;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("innova4b/ejemploCoche/application-context.xml");
		empleadoRepo = context.getBean("empleadoRepo",EmpleadoRepo.class);
	}
	
	@Test
	public void testFindAll() {
		assertEquals(3,empleadoRepo.findAll().size());
	}
	
	@Test
	public void test_comprobar_si_empleado_tiene_coche() {
		assertEquals(empleadoRepo.empleadoHasCocheBooked(2),1);
		assertEquals(empleadoRepo.empleadoHasCocheBooked(3),-1);
	}
	
	@Test
	public void test_comprobar_obtencion_Coche_Empleado() {
		assertEquals(empleadoRepo.getEmpleado(1).getNombre(),"Maite");
	}
	
	@Test
	public void test_comprobar_asignación_coche_a_empleado(){
		empleadoRepo.asignaCocheEmpleado(2, 1);
		assertEquals(empleadoRepo.getEmpleado(2).getIdCoche(),new Integer(1));
	}
}
