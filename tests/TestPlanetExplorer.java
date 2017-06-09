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
		PlanetExplorer vozilo = new PlanetExplorer(3, 3, N);
		vozilo.moveForth();
		asserteQuals("Napred", "(3, 4, N)", vozilo.getFormatedCoordinates));
	}
}
