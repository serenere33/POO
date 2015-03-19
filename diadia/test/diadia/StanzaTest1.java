package diadia;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stanza bar=new Stanza("bar");
		Stanza mensa=new Stanza("mensa");
		bar.impostaStanzaAdiacente("nord",mensa);
		mensa.impostaStanzaAdiacente("sud", bar);
		System.out.println("stanza oltre la porta nord del bar: "+bar.getStanzaAdiacente("nord").toString()+"\n");
		System.out.println("stanza oltre la porta sud della mensa: "+mensa.getStanzaAdiacente("sud").toString()+"\n");
		Attrezzo piatto = new Attrezzo("piatto", 1);
		Attrezzo tazzina = new Attrezzo("tazzina",1);
		mensa.addAttrezzo(piatto);
		bar.addAttrezzo(tazzina);
		System.out.println("attrezzi nella stanza adiacente al bar: "+bar.getStanzaAdiacente("nord").AttrezziToString());
		System.out.println("attrezzi nella stanza adiacente alla mensa: "+mensa.getStanzaAdiacente("sud").AttrezziToString());
		
	}

}
