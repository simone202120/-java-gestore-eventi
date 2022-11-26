package org.generation.italy.eventi;

import java.util.Scanner;



public class main {
	
	public static void main(String[] args) throws Exception {
		
		Evento ev = new Evento("Ciccio","2022-12-15",100);
			
			System.out.println(ev);
			System.out.println("-----------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuoi Fare una prenotazione? si/no");
		String i = sc.nextLine();
		
		if(i.equals("si")) {
			System.out.println("Inserisci la data per la prenotazione (yyyy-mm-dd): ");
			String dataPrenotazione=sc.nextLine();
			
			System.out.println("Quanti posti vuoi prenotare?");
			int posti=sc.nextInt();
			
			ev.prenota(dataPrenotazione,posti);
			
			System.out.println("Posti prenotati: " + ev.postiPrenotati);
			System.out.println("Psti disponibili: " + (ev.postiTotali - ev.postiPrenotati));
			System.out.println("goditilo spettacolo");
			
			
		}else if(i.equals("no")) {
			System.out.println("Vuoi disdire la prenotazione? si/no");
			String x=sc.nextLine();
			
			if(x.equals("si")) {
				
				System.out.println("Inserisci la data dello spettacolo per disire (yyyy-mm-dd): ");
				String dataPrenotazione=sc.nextLine();
				
				System.out.println("Quanti posti vuoi disdire?");
				int j=sc.nextInt();
				
				ev.disdici(dataPrenotazione, j);
				
				ev.postiPrenotati = ev.postiPrenotati - j;
				System.out.println("Posti disdetti: " + j);
				System.out.println("Posti ancora disponibili: " + (ev.postiTotali - ev.postiPrenotati));
			}else if (x.equals("no")) {
			System.out.println("Goditil o spettacolo");
			}
		}
	}
}
