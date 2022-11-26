package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Concerto extends Evento {
	LocalTime ora;
	BigDecimal prezzo;

	public Concerto(String titolo, String dataEvento, int postiTotali,LocalTime ora,BigDecimal prezzo) throws Exception {
		super(titolo, dataEvento, postiTotali);
		
		setOra(ora);
		setPrezzo(prezzo);
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	public String stampaDataOra() {
         String OraConcerto=ora.toString();
         return dataEvento + "/" + OraConcerto;
	}
	
	public String stampaPrezzo() {
		String PrezzoFormattato=prezzo.toString();
		return PrezzoFormattato;
	}
	
	@Override
	public String toString() {
		return "Data e ora Concerto: " + stampaDataOra() + "Titolo: "+ titolo + "Prezzo: " +  stampaPrezzo();
	}
	

}
