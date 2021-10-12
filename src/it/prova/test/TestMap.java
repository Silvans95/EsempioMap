package it.prova.test;

import java.util.HashMap;
import java.util.Map;

import it.prova.model.Indirizzo;
import it.prova.model.Persona;

public class TestMap {
public static void main(String[] args) {
	
	
	Map<Persona,Indirizzo> personeConIndirizzo = new HashMap<Persona,Indirizzo>();
	
	//inserimento
	personeConIndirizzo.put(new Persona("Silvano","Paloni"),new Indirizzo("via Tuscolana", "649"));
	personeConIndirizzo.put(new Persona("Jessica","Pal"),new Indirizzo("via mosca","52"));
	personeConIndirizzo.put(new Persona("Leonardo","nonRicordo"),new Indirizzo("via delle vie","80"));
	
	//creazione persona e indirizzo
	Persona p1 = new Persona("Lorenzo","Pet");
	Indirizzo i1 = new Indirizzo("Viale Cerbero","7");
	
	//inserimento
	personeConIndirizzo.put(p1, i1);
	
	// contains key
	System.out.println(personeConIndirizzo.containsKey(p1));
	
	//stampa mappa
	for (Map.Entry<Persona, Indirizzo> mapItem : personeConIndirizzo.entrySet()) {
		System.out.println(mapItem);
	}
	
	//stampa key = persona
	
	System.out.println("stampa key" +personeConIndirizzo.keySet());
	
	

	
}
}