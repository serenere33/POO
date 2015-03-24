package diadia;

import static org.junit.Assert.*;
import it.uniroma3.diadia.giocatore.*;
import org.junit.Before;
import org.junit.Test;


/**
 * GiocatoreTest definisce il comportamento esterno della classe giocatore
 * gestione dei cfu, attrezzi tramite invocazioni della classe Borsa
 * */
public class GiocatoreTest {
	private Giocatore TestPlayer;
	
	@Before
	public void Setup(){
		this.TestPlayer=new Giocatore();
	}
	
	
	@Test
	public void testCostruttore_Cfu() {
		assertEquals("errore nell'inizializzare i Cfu nel costruttore",20,this.TestPlayer.getCfu());
	}

	@Test
	public void testCostruttore_Borsa(){
		assertNotNull("la borsa non viene inizializzata nel costruttore",this.TestPlayer.getBorsa());
	}
	
	
	@Test
	public void testSetBorsa(){
		Borsa BorsaTest=new Borsa();
		this.TestPlayer.setBorsa(BorsaTest);
		assertSame("errore nell'assegnare la borsa",BorsaTest,this.TestPlayer.getBorsa());
	}
	
	@Test
	public void testSetCfu_negativi(){
		this.TestPlayer.setCfu(-1);
		assertEquals("non funziona con i numeri negativi, dovrebbe?",-1,this.TestPlayer.getCfu());
	}
}
