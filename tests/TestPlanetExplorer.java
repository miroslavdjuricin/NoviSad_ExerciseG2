import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_moveForth() throws PlanetExplorerException
	{
		PlanetExplorer vozilo = new PlanetExplorer(3, 3, "N");
		vozilo.moveForth();
		assertEquals("Napred", "(3, 4, N)", vozilo.getFormatedCoordinates());
	}

	public void test_moveBack() throws PlanetExplorerException
	{
		PlanetExplorer vozilo = new PlanetExplorer (3, 3, "N");
		vozilo.moveBack();
		assertEquals("Nazad", "(3, 2, N)", vozilo.getFormatedCoordinates());
	}
	
	public void test_moveLeft() throws PlanetExplorerException
	{
		PlanetExplorer vozilo = new PlanetExplorer (3, 3, "N");
		vozilo.moveLeft();
		assertEquals("Levo", "(3, 3, W)", vozilo.getFormatedCoordinates());
	}
	

	
}
