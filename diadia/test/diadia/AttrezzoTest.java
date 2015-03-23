package diadia;
/**
 * 
 * @author Serena Sensini & Valerio Dodet
 *
 */

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Before;
import org.junit.Test;

public class AttrezzoTest {
	
	private Attrezzo martello;
	
	@Before
	public void setUp(){
		martello = new Attrezzo("martello", 1);
	}
	
	@Test
	public void testGetPesoMartello() {
		assertEquals(1, martello.getPeso());
	}

	
	@Test
	public void testGetNome(){
		assertEquals("martello", martello.getNome());
	}
	
	@Test
	public void testToString(){
		assertEquals("martello (1kg)", martello.toString());		
	}
}
