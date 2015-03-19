package diadia;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class AttrezzoTest {

	public static void main(String[] argc){
		Attrezzo scudo=new Attrezzo("scudo",6);
		Attrezzo cacciavite=new Attrezzo("cacciavitone",12);
		System.out.println("scudo e cacciavite istanziati");
		System.out.println(scudo.toString()+" == scudo (6kg) ");
		System.out.println(cacciavite.toString()+" == cacciavitone (12kg)");
		System.out.println("carico trasportato: "+(scudo.getPeso()+cacciavite.getPeso())+"kg == 18kg");
		if(scudo.getPeso()>cacciavite.getPeso())	System.out.println(scudo.getNome());
		else	System.out.println(cacciavite.getNome());
	}

}

