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

import it.uniroma3.diadia.attrezzi.*;

public class AttrezzoTest {
	
	private Attrezzo cacciavite, martello;
	
	@Before
	public void setUp(){
		cacciavite = new Attrezzo("cacciavite", 1);
		martello = new Attrezzo("martello", 1);
	}
	
	@Test
	public void testGetPesoCacciavite() {
		assertEquals(1, cacciavite.getPeso());
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
