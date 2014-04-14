package innova4b.ejemploCoche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReservaServiceTest {

	ApplicationContext context;
	ReservaService reservaService;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("innova4b/ejemploCoche/application-context.xml");
		reservaService = context.getBean("reservaService",ReservaService.class);
	}
	
	@Test
	public void test_reserva_coche() {
		//antes de volver a asignar, quitar el coche al empleado 1 :)
		assertTrue(reservaService.reservaCoche(1, 1));
		assertFalse(reservaService.reservaCoche(2, 1));
	}

}
