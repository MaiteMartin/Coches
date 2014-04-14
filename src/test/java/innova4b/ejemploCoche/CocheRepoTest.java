package innova4b.ejemploCoche;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CocheRepoTest {
	
	ApplicationContext context;
	CocheRepo cocheRepo;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("innova4b/ejemploCoche/application-context.xml");
	}
	
	@Test
	public void testFindAll() {
		cocheRepo = context.getBean("cocheRepo",CocheRepo.class);
		assertEquals (2, cocheRepo.findAll().size());
	}
	
	@Test
	public void test_comprobar_si_coche_esta_Reservado() {
		cocheRepo = context.getBean("cocheRepo",CocheRepo.class);
		assertTrue (cocheRepo.isCocheBooked(1));
		assertFalse(cocheRepo.isCocheBooked(2));
	}
}
