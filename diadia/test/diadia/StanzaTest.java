package diadia;
/**
 * 
 * @author Serena Sensini & Valerio Dodet
 *
 */

import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.attrezzi.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StanzaTest {

	private Stanza Bar, Mensa;
	private Attrezzo tazzina, vassoio, bottiglia;
	
	@Before
	public void setUp(){
		Bar = new Stanza("bar");
		Mensa = new Stanza("mensa");
		tazzina = new Attrezzo("tazzina", 1);
		vassoio = new Attrezzo("vassoio", 3);
		bottiglia = new Attrezzo("bottiglia", 2);
		Bar.impostaStanzaAdiacente("nord",Mensa);
		Mensa.impostaStanzaAdiacente("sud", Bar);
		Bar.addAttrezzo(tazzina);
		Mensa.addAttrezzo(vassoio);
		Mensa.addAttrezzo(bottiglia);
	}

	@Test
	
	/*Verifica che le stanze adiacenti inizializzate nel
	 * SetUp siano corrette. In caso di direzione errata
	 * deve restituire null. */
	
	public void testGetStanzaAdiacenteBarNord() {
		assertEquals(Mensa, Bar.getStanzaAdiacente("nord"));
	}
	
	public void testGetStanzaAdiacenteMensaSud() {
		assertEquals(Bar, Mensa.getStanzaAdiacente("sud"));
	}
	
	public void testGetStanzaAdiacenteMensaOvest() {
		assertEquals(null, Mensa.getStanzaAdiacente("ovest"));
	}
	
	/*non necessario*/
	
	public void testGetNomeBar(){
		assertEquals("bar", Bar.getNome());
	}
	
	/*Controlla quali sono gli attrezzi aggiunti nella 
	 * stanza e se corrispondo a quelli impostati nel 
	 * SetUp.*/
	
	public void testGetAttrezziBar(){
		assertEquals("tazzina", Bar.AttrezziToString());
	}
	
	public void testGetAttrezziMensa(){
		assertEquals("vassoio bottiglia", Mensa.AttrezziToString());
	}
	
	
}
