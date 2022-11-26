package org.generation.italy.eventi;

import java.util.ArrayList;
import java.util.List;

public class ProgrammiEventi {
	String titolo;
	 List<String> Eventi = new ArrayList<String>();
	 
	 
	 public ProgrammiEventi(String Titolo) {
		 
	 }

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<String> getEventi() {
		return Eventi;
	}

	public void setEventi(List<String> eventi) {
		Eventi = eventi;
	}
	
	public void AggiungiEvento( ){
		
	}
}
