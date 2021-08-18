package fr.dish.programme;

public enum Day {

	MATIN(8, "Il est l'heure de se lever"), 
	MIDI(12, "A table"), 
	APRESMIDI(15, "Bon foot"), 
	SOIR(22, "Bonne nuit"), 
	NUIT(2, "Fais de beau rêve");
	
	private int hour;
	
	private String message;
	
	Day(int hour, String message){
		this.hour = hour;
		this.message = message;
	}
	
	public int getHour() {
		return hour;
	}
	
	public String getMessage() {
		return message;
	}
	
}
