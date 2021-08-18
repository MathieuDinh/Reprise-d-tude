package fr.dish.programme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		//@SuppressWarnings("unused")
		String pseudo = "Dish";
		int age = 16;
		
		System.out.println(age + 4);
		System.out.println(pseudo);
		System.out.println(pseudo + " " + age);
		age++; // age = age + 1
		System.out.println(pseudo + " " + age);
		age--; // age = age - 1
		System.out.println(pseudo + " " + age);
		age += 4; // age = age + 4
		System.out.println(pseudo + " " + age);
		
		
		System.out.println(" ");
		
		
		int note1 = 13;
		int note2 = 17;
		int note3 = 6;
		
		int calcul = (note1 + note2 + note3) / 3;
		System.out.println("Note 1 :" + " " +note1);
		System.out.println("Note 2 :" + " " +note2);
		System.out.println("Note 3 :" + " " +note3);
		System.out.println("La moyenne des notes : " + calcul);
		
		
		System.out.println(" ");
		
		
	// LES CONDITIONS :	
		
		int money = 2000;
		
		if(money == 2020) {
			System.out.println("Les deux valeurs sont bien les mêmes");
		} else {
			System.out.println("Les deux valeurs ne sont plus les mêmes");
		}

		
		if(age >= 18) {
			System.out.println("La personne est majeur");
		} else if(age <= 10) {
			System.out.println("La personne est très jeune (moins de 10 ans)");
		} else {
			System.out.println("La personne est mineur");
		}
		
		
		switch(age) {
		case 10 :
			System.out.println("Ohh la la parfait :3");
		break;
		case 11 :
			System.out.println("Mouaais bof x)");
		break;
		default: System.out.println("Aucun commentaire");
		}
		
		
		int pricephone = 800;
		boolean hasphone = false;
		
		// '&&' pour ajouter des conditions
		// le '!' avant hasphone signifie la négation
		if(money >= pricephone && !hasphone) {
			System.out.println("Tu peux acheter ce téléphone");
		} else {
			System.out.println("Tu ne peux pas acheter ce téléphone");
		}
		
		
		System.out.println(" ");
		
	// LES BOUCLES :
		
		// Pour les chaines de charactères -> il faut split
		String pseudoss = "Enrique,Andy,Alex,Sebastien,Erwan";
		String[] pseudos = pseudoss.split(",");
		int[] notes = { 7, 8, 12, 2};
		int calculnote = 0;
		
		System.out.println(pseudos[0]);
		
		for(int i =14; i < 20; i++) {
			System.out.println("Ceci est le tour de boucle : " + i);
		}
		
		for(String str : pseudos) {
			System.out.println(str);
		}
		
		for(int note : notes) {
			calculnote = calculnote += note;
		}
		
		System.out.println("La moyenne est de : " + (calculnote / notes.length));
	
		int i = 0;
		
		while(i != 7) {
			i++;
			System.out.println("cc" + i);
		}
		
		do {
			System.out.println("lst" + i);
			i++;
		} while(i <= 10);
		
		
		System.out.println(" ");
		
		
		sendMessage("test 1", 9);
		sendMessage("test 2", 17);
		
		sendMessage("La différence est de : " + getResultat(money, pricephone, hasphone), 9);
	
	// LES CONSTRCUTEURS
		
		System.out.println("La programmation objet commence maintenant #constructeur : ");
		
		
		Player player1 = new Player("Mon joueur", 20.0, 300.0);
		System.out.println("Joueur 1: " + player1.getName());
		System.out.println("La vie: " + player1.getHealth());
		
		Player player2 = new Player("Ton joueur", 30.0,	150.0);
		//player2.setName("Test");
		System.out.println("Joueur 2: " + player2.getName());
		System.out.println("La vie: " + player2.getHealth());
		
		//player1.damage(5.5);
		player2.damage(player1.getAttack());
		player1.damage(player2.getAttack());
		//System.out.println("La vie restante de " + player1.getName() + " est de : " + player1.getHealth() + "pts.");
		//System.out.println("La vie restante de " + player2.getName() + " est de : " + player2.getHealth() + "pts.");
		
		
		System.out.println("Chapitre suivant : ");
		
		
	// L'HERITAGE
		
		Apple a = new Apple();
		a.taste();
		a.miam();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
		if(a instanceof PeelFruit) {
			System.out.println("Ce fruit implémente l'interface PeelFruit");
		}
		
		if(a instanceof PeelFruit) {
			PeelFruit fruit = pen;
			fruit.getSkinType();
		}
		
		
	// LES ENUMERATIONS
		
		//Day moment = Day.MATIN;
		//System.out.println("Nous somme le : " + moment.name() + " / il est : " + moment.getHour() + "h / " + moment.getMessage());
		
		//moment = Day.SOIR;
		//System.out.println("Nous somme le : " + moment.name() + " / il est : " + moment.getHour() + "h / " + moment.getMessage());
		
		
		for(Day moment : Day.values()) {
			System.out.println("Nous somme le : " + moment.name().toLowerCase() + " / il est : " + moment.getHour() + "h / " + moment.getMessage());
		}
		
		System.out.println("Pause : ");
		
		for(Day moment : Day.values()) {
			if (!moment.equals(Day.MIDI) && !moment.equals(Day.SOIR) && !moment.equals(Day.NUIT) ) {
			System.out.println("Nous somme le : " + moment.name().toLowerCase() + " / il est : " + moment.getHour() + "h / " + moment.getMessage());
			}
		}
		
		
		
	// LES ARRAYLISTS
		
		//ArrayList list = new ArrayList();
		//list.add(25);
		//list.add("Texte");
		//list.add(new Object());
		
		//System.out.println(list);
		
		//list.remove(0);
		
		//System.out.println(list);
		
		//list.add(25);
	
		//if(list.size() != 1) {
			//System.out.println("le tableau n'est pas égal a 1");
		//}
		
		//if(list.contains(25)) {
			//System.out.println("L'élément existe!");
		//}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Texte");
		list.add("Test");
		list.add("Hell 462");
		
		System.out.println(list);
		
		
	// LES HASHMAPS
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("JJ", 58);
		ages.put("JC", 19);
		ages.put("OK", 7);
		
		System.out.println(ages);
		System.out.println(ages.get("JC"));
		
		if(ages.containsKey("JJ")) {
			System.out.println("La clé existe");
		} else {
			System.out.println("La clé n'existe pas");
		}
		
		ages.remove("JJ");
		System.out.println(ages.toString());
		
		if(ages.containsKey("JJ")) {
			System.out.println("La clé existe");
		} else {
			System.out.println("La clé n'existe pas");
		}
		
		int moyenne = 0;
		
		for(Entry<String, Integer> element : ages.entrySet()) {
			System.out.println("La clé est : " + element.getKey() + " , son age : " + element.getValue());
			moyenne += element.getValue();
		}
		
		System.out.println(moyenne / ages.size());
		
		
	}
	
	
	// LES FONCTIONS
	
		private static void sendMessage(String message, int number) {
			System.out.println("Ceci est un petit message dans la console ! " + message + " & " + number);
		}
		
		private static int getResultat(int money, int pricephone, boolean hasphone) {
			if(money >= pricephone && !hasphone) {
				System.out.println("Tu peux acheter ce téléphone");
			} else {
				System.out.println("Tu ne peux pas acheter ce téléphone");
			}
			
			return money - pricephone;
		}

}











