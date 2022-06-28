package jana60;

import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dove vuoi andare?");
		String destinazioneInput = scan.nextLine();
		
		System.out.print("Inserisci il giorno di partenza: ");
		int giornoPartenza = scan.nextInt();
		
		System.out.print("Inserisci il mese di partenza: ");
		int mesePartenza = scan.nextInt();
		
		System.out.print("Inserisci l'anno di partenza: ");
		int annoPartenza = scan.nextInt();
		LocalDate dataPartenza = null;
		
		try {
			dataPartenza = LocalDate.of(annoPartenza, mesePartenza, giornoPartenza);
		} catch (Exception e) {
			System.out.println("Data di partenza non valida");
		}
		
		System.out.print("Inserisci il giorno di ritorno: ");
		int giornoRitorno = scan.nextInt();
		
		System.out.print("Inserisci il mese di ritorno: ");
		int meseRitorno = scan.nextInt();
		
		System.out.print("Inserisci l'anno di ritorno: ");
		int annoRitorno = scan.nextInt();
		
		LocalDate dataRitorno = null;
		
		try {
			dataRitorno = LocalDate.of(annoRitorno, meseRitorno, giornoRitorno);
		} catch (Exception e) {
			System.out.println("Data ritorno non valida");
		}
		
		try {
			Correzzione nuovaVacanza = new Correzzione(destinazioneInput, dataPartenza, dataRitorno);
			System.out.println("Hai prenotato una vacanza di " + nuovaVacanza.durataVacanzaStringa() + " a " + nuovaVacanza.getDestinazione());
		} catch (NullPointerException e) {
			System.out.println("Tutti i dati devono essere compilati");
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Dati non validi");
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
