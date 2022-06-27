package jana60;

import java.time.LocalDate;

public class Vacanza {

	private String destinazione;
	private int giornoInizio, giornoFine, meseInizio, meseFine, annoInizio, annoFine;
	private int annoCorrente = 2022;
	
	
	
	public Vacanza(String destinazione, int giornoInizio, int meseInizio, int annoInizio, int giornoFine, int meseFine, int annoFine) throws Exception{
		
		
		this.destinazione = destinazione;
		this.giornoInizio = giornoInizio;
		this.meseInizio = meseInizio;
		this.annoInizio = annoInizio;
		this.giornoFine = giornoFine;
		this.meseFine = meseFine;
		this.annoFine = annoFine;
		
		this.validaGiornoInizio();
		this.validaGiornoFine();
		this.validaMeseInzio();
		this.validaMeseFine();
		this.validaAnnoInizio();
		this.validaDati();
		this.dataInizioDopoDataFine();
		this.dataInizioPassata();
		
	}

	LocalDate dataInizio = LocalDate.of(annoInizio, meseInizio, giornoInizio);
	LocalDate dataFine = LocalDate.of(annoFine, meseFine, giornoFine);
	LocalDate oggi = LocalDate.now();
	
	//metodi di validazione
	private void validaGiornoInizio() throws Exception{
		if (giornoInizio < 1 || giornoInizio > 31 ) {
			throw new Exception ("Giorno di inzio non valido");
		}
	}
	
	private void validaGiornoFine() throws Exception{
		if (giornoFine < 1 && giornoFine > 31){
			throw new Exception("Giorno di fine non valido");
		}
	}
	
	private void validaMeseInzio() throws Exception {
		if (meseInizio < 1 || meseInizio > 12) {
			throw new Exception("Mese inizio non valido");
		}
	}
	
	private void validaMeseFine() throws Exception {
		if (meseFine < 1 || meseFine > 12) {
			throw new Exception("Mese fine non valido");
		}
	}
	
	private void validaAnnoInizio() throws Exception{
		if (annoInizio < annoCorrente) {
			throw new Exception ("L'anno di inizio non puó essere precedente all'anno corrente");
		}
	}
	
	private void validaDati() throws Exception{
		if (dataInizio == null || dataFine == null || destinazione == null) {
			throw new Exception ("Completa tutti i campi per continuare");
		}
	}
	
	private void dataInizioDopoDataFine () throws Exception{
		if (dataInizio.isAfter(dataFine)) {
			throw new Exception ("La data di inizio non puó essere successiva alla data di fine");
		}
	}
	
	private void dataInizioPassata() throws Exception {
		if (dataInizio.isBefore(oggi)) {
			throw new Exception ("La data di inizio non puó essere precedente alla data corrente");
		}
	}	
	//getter e setter
	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public int getGiornoInizio() {
		return giornoInizio;
	}

	public void setGiornoInizio(int giornoInizio) {
		this.giornoInizio = giornoInizio;
	}

	public int getGiornoFine() {
		return giornoFine;
	}

	public void setGiornoFine(int giornoFine) {
		this.giornoFine = giornoFine;
	}

	public int getMeseInizio() {
		return meseInizio;
	}

	public void setMeseInizio(int meseInizio) {
		this.meseInizio = meseInizio;
	}

	public int getMeseFine() {
		return meseFine;
	}

	public void setMeseFine(int meseFine) {
		this.meseFine = meseFine;
	}

	public int getAnnoInizio() {
		return annoInizio;
	}

	public void setAnnoInizio(int annoInizio) {
		this.annoInizio = annoInizio;
	}

	public int getAnnoFine() {
		return annoFine;
	}

	public void setAnnoFine(int annoFine) {
		this.annoFine = annoFine;
	}
	
	
	
}
