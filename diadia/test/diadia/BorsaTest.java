package diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.giocatore.*;
import it.uniroma3.diadia.attrezzi.*;

public class BorsaTest {
private Borsa B1;
private Attrezzo martello, cacciavite/*, trapano*/;


/**@Test va prima di ogni metodo di test, altrimenti non lo esegue.
 * esistono molte asserzioni diverse da poter usare, praticamente una per ogni caso.
*Inoltre sarebbe meglio scrivere una stringa di errore nel caso il test fallisse descrivendo
* il caso testato o dei riferimenti per localizzare il bug
* */
	@Before
	public void setUp(){
		martello = new Attrezzo("martello", 10);
		cacciavite = new Attrezzo("cacciavite", 20);
//		trapano = new Attrezzo("trapano", 7);
		B1 = new Borsa(10);
	}

	@Test
	
	/*Verifico che la borsa sia vuota.*/
	
	public void testIsEmpty(){
		assertTrue("errore Borsa.numeroAttrezzi",B1.isEmpty());
	}
	/*Aggiungo tre attrezzi: la somma dei pesi dei primi due
	 * da 10, quindi il terzo non potrà essere aggiunto
	 * a causa del peso massimo della borsa.*/
	
	@Test
	public void testAddAttrezzoMartello() {
		assertTrue(B1.addAttrezzo(martello));
	}
	
//	@Test
//	public void testAddAttrezzoTrapano() {
//		assertTrue(B1.addAttrezzo(trapano));
//	}
	
	@Test
	public void testAddAttrezzoCacciavite() {
		assertFalse("see Borsa.getPeso(), see Attrezzo.getPeso(), see Borsa.getPesoMax()", B1.addAttrezzo(cacciavite));
	}
	
	/*Controllo che nella borsa siano presenti gli attrezzi
	 * aggiunti prima e provo con un attrezzo non presente,
	 * per verifica che il controllo avvenga correttamente.*/
	
	
	@Test
	public void testHasAttrezzoMartello(){
		B1.addAttrezzo(martello);
		assertTrue(B1.hasAttrezzo("martello"));
	}
	
	
	@Test
	public void testHasAttrezzoCric(){
		assertFalse(B1.hasAttrezzo("Cric"));
	}
	
	/*Se presenti, restituisco degli attrezzi presi dalla 
	 * borsa.*/
	@Test
	public void testGetAttrezzoMartello(){
		B1.addAttrezzo(martello);
		assertSame(martello, B1.getAttrezzo("martello"));
	}
	
	
	@Test
	public void testGetAttrezzoAccetta(){
		assertNull(B1.getAttrezzo("accetta"));
	}
	
	/*Rimuovo un oggetto dalla borsa che è presente, e provo
	 * con uno che non ho aggiunto per verifica che il 
	 * controllo avvenga correttamente.*/
	@Test
	public void testRemoveAttrezzoMartello(){
		B1.addAttrezzo(martello);
		assertSame(martello, B1.removeAttrezzo("martello"));
	}
	
	
	@Test
	public void testRemoveAttrezzoPinze(){
		assertNull(B1.removeAttrezzo("pinze"));
	}
	
