package org.lessons.java.geometria;

import java.util.Iterator;
import java.util.Scanner;

//2. Creare una classe `Main` contenente il metodo `main()`, 
//nel quale chiedete all’utente di inserire da console i
//valori di *base* e *altezza* con cui istanziare un nuovo `Rettangolo`.
//Dopo averne istanziati almeno 3 in 3 diverse variabili,
//stampate a video i lati, l'area e il perimetro di ogniuno.

public class main {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Rettangolo trig = new Rettangolo();
			
			System.out.println("quanto vale la base?: ");
			trig.base = input.nextInt();
			System.out.println("quanto vale l'altezza? : ");
			trig.altezza = input.nextInt();
			System.out.println("il perimetro è: " + trig.calcoloPerimetro(trig.base, trig.altezza));
			System.out.println("l'area è: " + trig.calcoloArea(trig.base, trig.altezza));
			trig.Disegna(trig.base, trig.altezza);
			
		}
		input.close();
	}
}
