package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.giocatore.*;
import it.uniroma3.diadia.attrezzi.*;

public class BorsaTest {
private Borsa B1;
private Attrezzo martello, cacciavite, trapano;

	@Before
	public void setUp(){
		martello = new Attrezzo("martello", 3);
		cacciavite = new Attrezzo("cacciavite", 1);
		trapano = new Attrezzo("trapano", 7);
		B1 = new Borsa();
	}

	@Test
	
	/*Verifico che la borsa sia vuota.*/
	
	public void testIsEmpty(){
		assertEquals(true, B1.isEmpty());
	}
	/*Aggiungo tre attrezzi: la somma dei pesi dei primi due
	 * da 10, quindi il terzo non potrà essere aggiunto
	 * a causa del peso massimo della borsa.*/
	
	public void testAddAttrezzoMartello() {
		assertEquals(true, B1.addAttrezzo(martello));
	}
	
	public void testAddAttrezzoTrapano() {
		assertEquals(true, B1.addAttrezzo(trapano));
	}
	
	public void testAddAttrezzoCacciavite() {
		assertEquals(false, B1.addAttrezzo(cacciavite));
	}
	
	/*Controllo che nella borsa siano presenti gli attrezzi
	 * aggiunti prima e provo con un attrezzo non presente,
	 * per verifica che il controllo avvenga correttamente.*/
	
	public void testHasAttrezzoMartello(){
		assertEquals(true, B1.hasAttrezzo("martello"));
	}
	
	public void testHasAttrezzoCric(){
		assertEquals(false, B1.hasAttrezzo("cric"));
	}
	
	/*Se presenti, restituisco degli attrezzi presi dalla 
	 * borsa.*/
	
	public void testGetAttrezzoTrapano(){
		assertEquals(trapano, B1.getAttrezzo("trapano"));
	}
	
	public void testGetAttrezzoAccetta(){
		assertEquals(null, B1.getAttrezzo("accetta"));
	}
	
	/*Rimuovo un oggetto dalla borsa che è presente, e provo
	 * con uno che non ho aggiunto per verifica che il 
	 * controllo avvenga correttamente.*/
	
	public void testRemoveAttrezzoMartello(){
		assertEquals(martello, B1.removeAttrezzo("martello"));
	}
	
	public void testRemoveAttrezzoPinze(){
		assertEquals(null, B1.removeAttrezzo("pinze"));
	}
	
///*non necessario*/
////	public void testGetPeso(){
////		
////	}
}
