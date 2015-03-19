
package diadia;

import static org.junit.Assert.*;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Test;

public class AttrezzoTest2 {
	
	@Test
	public void testGetPesoInt() {
//		fail("Not yet implemented");
		assertEquals(1,new Attrezzo("cacciavitone",1).getPeso());
	}

	
	@Test
	public void testGetNome(){
		assertEquals("martello",new Attrezzo("martello",1).getNome());
	}
	
	@Test
	public void testToString(){
		assertEquals("trapano pneumatico (2kg)",new Attrezzo("trapano pneumatico",2).toString());		
	}
}
