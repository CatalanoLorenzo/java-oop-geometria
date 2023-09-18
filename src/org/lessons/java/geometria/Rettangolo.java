package org.lessons.java.geometria;

//Nel progetto java-oop-geometria creare un package `org.lessons.java.geometria` in cui inserire le seguenti classi:
//1. Classe `Rettangolo` caratterizzata da 2 attributi interi: 
//- base
//- altezza
//Definire un costruttore con parametri. Definire 2 metodi: 
//	- calcolaArea
//- calcolaPerimetro
//	I due metodi restituiscono rispettivamente l'area e il perimetro del rettangolo.
public class Rettangolo {
	int base;
	int altezza;

	public int calcoloArea(int base, int altezza) {
		int area = base * altezza;
		return area;
	}

	public int calcoloPerimetro(int base, int altezza) {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}

	public void Disegna(int base, int altezza) {
		String baseD = "";
		String centroD = "";
		for (int x = 0; x < base; x++) {
			if (x == 0 || x == base - 1) {
				centroD += "0";
			} else {
				centroD += " ";
			}
			baseD += "0";
		}

		for (int i = 0; i < altezza; i++) {
			if (i == 0 || i == altezza - 1) {
				System.out.println(baseD);
			} else {
				System.out.println(centroD);

			}
		}
	}
}