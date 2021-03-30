package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
	
	/*
     * Kullanicidan bir isim alin ve bu ismi char array'ine donusturen bir method yazin
     * 
     *
     * (toCharArray methodunu kullanmayin)
     *
     * Input : John
     * Output : [J, o, h, n]
     */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.next();
		

		stringToCharaDonustur(isim);
	}
	
	public static void stringToCharaDonustur(String isim) {
		
		char harfler[] = new char[isim.length()]; 	// Techpro T, e, c, h, p, r, o
			for(int i = 0; i<isim.length(); i++) {
				harfler[i] = isim.charAt(i); 		// harfler[2] = 'c'; = 2; "Tech";
			}
		
			System.out.println(Arrays.toString(harfler));
			
	}

}
