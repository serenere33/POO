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

Labirinto L1;
	/*SetUp non necessario*/

	@Test
	public void test() {
		L1 = new Labirinto();
		assertEquals("Atrio", L1.getIngresso().getNome());
		assertEquals("Biblioteca", L1.getUscita().getNome());
	}

}
