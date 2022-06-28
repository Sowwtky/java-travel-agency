package jana60;

import java.time.LocalDate;
import java.time.Period;

public class Correzzione {

	//attributi
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	//costruttore
	public Correzzione(String destinazione, LocalDate dataInizio, LocalDate dataFine) 
			throws NullPointerException, IllegalArgumentException{
		super();
		//prima di assegnare i valori agli attributi li testo
		//controllo che i valori non siano null
		if (destinazione == null || dataInizio == null || dataFine == null) {
			throw new NullPointerException ("Completa tutti i campi per continuare"); 
		}
		
		//controllo che i valori siano validi
		//data inizio non passata
		if(dataInizio.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException ("La data inizio non puó essere prima della data odierna");
		}
		
		//data fine non precedente alla data inizio
		if(dataInizio.isAfter(dataFine)) {
			throw new IllegalArgumentException("La data di fine non puó essere precedente alla data di inizio");
		}
		
		//se ho passato le validazioni inizializzo gli attributi dell'oggetto
		this.destinazione = destinazione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		
	}
	
	public Period durataVacanza() {
		return Period.between(this.dataInizio, this.dataFine);
	}
	
	public String durataVacanzaStringa () {
		Period durata = durataVacanza();
		String durataVacanza ="";
		if (durata.getYears() > 0) {
			durataVacanza += durata.getYears() + " anni";
		}
		
		if (durata.getMonths() > 0) {
			durataVacanza += durata.getMonths() + " mesi";
		}
		
		if (durata.getDays() > 0) {
			durataVacanza += durata.getDays() + " giorni";
		}
		
		return durataVacanza;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}
	
	
}
