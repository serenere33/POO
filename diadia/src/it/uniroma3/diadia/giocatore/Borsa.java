package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
/**
 * Questa classe implementa una borsa che contiene tutti
 * gli attrezzi del giocatore presi durante il gioco.
 *  
 *  @author Valerio Dodet & Serena Sensini
 *  @see Attrezzi
 *  @version 0.1
 *  */

public class Borsa { 
	 public final static int DEFAULT_PESO_MAX_BORSA = 10; 
	 private Attrezzo[] attrezzi; 
	 private int numeroAttrezzi; 
	 private int pesoMax; 
	 
	 public Borsa() { 
	  this(DEFAULT_PESO_MAX_BORSA); 
	 } 
	 
	 public Borsa(int pesoMax) { 
	  this.pesoMax = pesoMax; 
	  this.attrezzi = new Attrezzo[10]; // speriamo che bastino... 
	  this.numeroAttrezzi = 0; 
	 } 
	 
	 public boolean addAttrezzo(Attrezzo attrezzo) { 
	  if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax()) 
	   return false; 
	  if (this.numeroAttrezzi==10) 
	   return false; 
	  this.attrezzi[this.numeroAttrezzi] = attrezzo; 
	  this.numeroAttrezzi++; 
	  return true; 
	 } 
	 
	 public int getPesoMax() { 
	  return pesoMax; 
	 } 
	 
	 public Attrezzo getAttrezzo(String nomeAttrezzo) { 
	  Attrezzo a = null; 
	  for (int i= 0; i<this.numeroAttrezzi; i++) 
	   if (this.attrezzi[i].getNome().equals(nomeAttrezzo)) 
	    a = attrezzi[i]; 
	  return a; 
	 } 
	 
	 public int getPeso() { 
	  int peso = 0; 
	  for (int i= 0; i<this.numeroAttrezzi; i++) 
	   peso += this.attrezzi[i].getPeso(); 
	  return peso; 
	 } 
	 
	 public boolean isEmpty() { 
	  return this.numeroAttrezzi == 0; 
	 } 
	 
	 public boolean hasAttrezzo(String nomeAttrezzo) { 
	  return this.getAttrezzo(nomeAttrezzo)!=null; 
	 } 
	 
	 /*CONTROLLARE metodo remove: se rimuovo un oggetto 
	  * intermedio dall'array di attrezzi, la locazione
	  * diventa vuota, ma nel metodo di aggiunta non c'è
	  * alcun controllo sulle posizioni vuote e gli 
	  * attrezzi vengono messi automaticamente alla fine.
	  * Questo vuol dire che se ho tolto un oggetto alla 
	  * posizione 4 e avevo 9 oggetti, se ne aggiungo uno,
	  * si genera un'eccezione.*/
	 public Attrezzo removeAttrezzo(String nomeAttrezzo) { 
	  Attrezzo a = null; 
	  for(int i=0; i<this.numeroAttrezzi; i++){
		  if(this.attrezzi[i].equals(nomeAttrezzo)){
			  a=this.attrezzi[i];
			  this.attrezzi[i]=null;
			  this.numeroAttrezzi--;
		  }
	  }
	  return a; 
	 } 
	 
	 public String toString() { 
	  StringBuilder s = new StringBuilder(); 
	      if (!this.isEmpty()) { 
	       s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): "); 
	       for (int i= 0; i<this.numeroAttrezzi; i++) 
	        s.append(attrezzi[i].toString()+" "); 
	       } 
	      else  
	       s.append("Borsa vuota"); 
	      return s.toString(); 
	 } 
	 
	}