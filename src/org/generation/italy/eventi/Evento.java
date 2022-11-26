package org.generation.italy.eventi;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Evento {
	String titolo;
	String dataEvento;
	int postiTotali;
	int postiPrenotati;
	String today=LocalDate.now().toString();
	
	public Evento(String titolo, String dataEvento, int postiTotali) throws Exception {
		setTitolo(titolo);
		setPostiTotali(postiTotali);
		setDataEvento(dataEvento);
		int postiPrenotati=0;

	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) throws Exception {

            SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
            java.util.Date dataEventoD = dateFormat.parse(dataEvento);
            java.util.Date date2 = dateFormat.parse(today);
            
            if(date2.after(dataEventoD)){
            	throw new Exception("LA DATA DELL'EVENTO NON PUO' ESSERE PRECEDENTE A OGGI");
            } 
       
        	this.dataEvento = dataEvento;
	}

	

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public void setPostiTotali(int postiTotali){
		
		this.postiTotali = postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	public void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
	public void prenota(String dataPrenotazione, int postiRichiesti)throws Exception {
		 SimpleDateFormat dateformat = new SimpleDateFormat ("yyyy-mm-dd");
		 java.util.Date date3 = dateformat.parse(dataPrenotazione);
         java.util.Date date4 = dateformat.parse(dataEvento);

		if(postiRichiesti>postiTotali || date3.after(date4)) {
			throw new Exception("IMPOSSIBILE PRENOTARE");
		}else {
			postiPrenotati=postiPrenotati + postiRichiesti;
		}
	}
	public void disdici( String dataPrenotazione,int postiDisdetta )throws Exception {
		
		 SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
         java.util.Date date1 = dateFormat.parse(dataPrenotazione);
         java.util.Date date2 = dateFormat.parse(dataEvento);
         
		if(postiPrenotati==0 || date2.after(date1) ) {
			throw new Exception("NON CI SONO PRENOTAZIONI");
		}else {
			postiPrenotati--;
		}
	}
	
	@Override
	public String toString() {
		
		return "titolo spettacolo: " + titolo + "\ndata: " + dataEvento + "\nPosti stanziati: " + getPostiTotali();
	}
}
