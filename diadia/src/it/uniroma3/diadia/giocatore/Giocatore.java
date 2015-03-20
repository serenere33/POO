package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.Partita;

/**
 * Questa classe definisce lo stato del giocatore tramite gestione dei CFU
 *  e dei suoi attrezzi
 *  
 *  @author Valerio Dodet & Serena Sensini
 *  @see Borsa
 *  @see Partita
 *  @version 0.1
 *  */
public class Giocatore {
	private Borsa marsupio;
	private int cfu;
	private static int CFU_INIZIALI = 20;
	
	
	/**
	 * inizializza una borsa e i CFU*/
	public Giocatore() {
		// TODO Auto-generated constructor stub
		this.cfu=CFU_INIZIALI;
		
	}

	/**
	 * Setter e Getter dei parametri + toString()
	 * */
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}	
	

}
