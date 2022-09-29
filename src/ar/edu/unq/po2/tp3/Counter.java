package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    
	private List<Integer> numbers = new ArrayList<Integer>(); 
	
	
	public void addNumber(int n) {
		numbers.add(n);
	}
	
	// Punto 1
	public int getEvenOcurrences() {
		int cantPares = 0;
		for (Integer entero: numbers) {
			if(entero % 2 == 0) {
				cantPares++; 
			}
		}
		return cantPares;
	}
	public int getOddOcurrences() {
		int cantImpares = 0;
		for (Integer entero: numbers) {
			if(entero % 2 == 1) {
				cantImpares++; 
			}
		}
		return cantImpares;
	}
	public int getMultipleOcurrences(int n) {
		int cantMultiplos = 0;
		for (Integer entero: numbers) {
			if(entero % n == 0) {
				cantMultiplos++; 
			}
		}
		return cantMultiplos;
	}
	
	//Punto 2
//	public int getNumberWithMostEvenDigits() {
//		int cantMultiplos = 0;
//		for (Integer entero: numbers) {
//			if(entero == 0) {
//				cantMultiplos++; 
//			}
//		}
//		return cantMultiplos;
//	}
	
	
}
