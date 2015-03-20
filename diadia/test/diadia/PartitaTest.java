/**
 * 
 */
package diadia;

import static org.junit.Assert.*;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Serena Sensini & Valerio Dodet
 *
 */
public class PartitaTest {
	Partita PartitaTest;
	Stanza StanzaTest;
	
	@Before
	public void SetUp(){
	this.PartitaTest = new Partita();
	}
	
	@Test
	public void testSetFinita_GlobaleFinita(){
		this.PartitaTest.setFinita();
		assertTrue("errore con l'assegnazione della variabile globale finita",
					this.PartitaTest.isFinita());
	}
	
	@Test
	public void testVinta_parametroGetStanzaCorrente(){
		this.PartitaTest.setStanzaCorrente(this.PartitaTest.getLabirinto().getUscita());
		assertTrue("errore nel verificare la stanza corrente, see Labirinto",
					this.PartitaTest.vinta());
	}
	
	@Test
	public void testVinta_parametroGetStanzaCorrenteFALSE(){
		this.PartitaTest.setStanzaCorrente(new Stanza("StanzaTest"));
		assertFalse("errore in getStanzaCorrente() o setStanzaCorrente()",
					this.PartitaTest.vinta());
	}
	
	@Test
	public void testisFinita_parametroCfuTRUE(){
		this.PartitaTest.studente.setCfu(0);
		assertTrue("errore con il calcolo dei Cfu rimanenti, see Giocatore",
					this.PartitaTest.isFinita());
	}
	
	@Test
	public void testisFinita_parametroCfuFALSE(){
		assertFalse("errore con il calcolo dei Cfu rimanenti, see Giocatore",
					this.PartitaTest.isFinita());
	}
}
