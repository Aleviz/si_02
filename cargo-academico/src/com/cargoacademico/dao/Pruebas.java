package com.cargoacademico.dao;

import org.hibernate.jpa.criteria.expression.SearchedCaseExpression.WhenClause;

public class Pruebas {

	public static void main(String[] args) {
//
//		int[] myArray = { 1, 2, 1, 3, 3, 1, 2, 1, 5, 1 };
//		int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
//
//		for (int i = 0; i < myArray.length; i++) {
//
//			if (myArray[i] == 1) {
//				uno++;
//			} else if (myArray[i] == 2) {
//				dos++;
//			} else if (myArray[i] == 3) {
//				tres++;
//			} else if (myArray[i] == 4) {
//				cuatro++;
//			} else if (myArray[i] == 5) {
//				cinco++;
//			}
//		}
//		System.out.println("uno :" + uno);
//		System.out.println("dos: "+dos);
//		System.out.println("tres: "+tres);
//		System.out.println("cuatro: "+cuatro);
//		System.out.println("cinco: "+cinco);
		int numero[] = new int[9];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = i + 1;
			System.out.print(numero[i]);
			if (i == 2) {
				System.out.println("");
			} else if (i == 5) {
				System.out.println("");
			}
		}
	}

}
