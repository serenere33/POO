/**
 * Classe JUnit Test per la classe Labirinto. Inizializza
 * un labirinto e verifica uscita ed entrata.
 */
package diadia;
import it.uniroma3.diadia.ambienti.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Serena Sensini & Valerio Dodet
 *
 */
public class LabirintoTest {

	Labirinto labirintoDefault;
	

	public void Setup(){
		this.labirintoDefault=new Labirinto();
	}

	@Test
	
	/*Inizializza un labirinto e verifica che le stanze
	 * di ingresso e di uscita siano state inizializzate.*/
	
	public void testGetIngresso() {
		assertEquals("Atrio", this.labirintoDefault.getIngresso().getNome());
	}
	
	@Test
	public void testGetUscita(){
		assertEquals("Biblioteca", this.labirintoDefault.getUscita().getNome());
	}

	@Test
	public void testSetIngresso(){
		Stanza ingresso=new Stanza("ingresso");
		this.labirintoDefault.setIngresso(ingresso);
		assertEquals(ingresso,this.labirintoDefault.getIngresso());
	}
	
	@Test
	public void testsetUscita(){
		Stanza uscita=new Stanza("ingresso");
		this.labirintoDefault.setUscita(uscita);
		assertEquals(uscita,this.labirintoDefault.getUscita());
	}
}
