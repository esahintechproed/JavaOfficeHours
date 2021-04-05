package day05;

import java.util.Scanner;

/*
Bir String parametre kabul eden bir method yazin, String builder kullanarak
o Stringi ters cevirin. Sonrasýnda girilen String palindrome mu degil mi kontrol eden
java kodunu yaziniz
Eg : input : I love Java
Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"
*/

public class Question03 {
	
	/*
	 	ONEMLI*****: Eger methodumuzun return type'i void ise method icerisinde
	 bir deger return edemeyiz. Fakat methodumuzun return type'i void'den farkli bir return type ise
	 bir return keyword'u olmak zorunda. Return type'i voidden farkli bir method syso() kullanamaz diye
	 bir kural soz konusu bile olamaz. Return edilicek deger'de method'un return type'i ile ayni veri
	 tipinde olmak zorundadir.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//System.out.println(isPalindrome(input));
		System.out.println(isPalindrome(input));
		 //Return type'i void harici bir method'da 
		//System.out.println(isPalindrome(scan.nextLine())); 18 ve 19. cu satirlarla ayni islemi gorur
	}

	public static boolean isPalindrome(String word) {
		boolean flag = false;
		// kutuk  kutuk
		StringBuilder wordSb = new StringBuilder(word);
		wordSb.reverse(); // alican -> nacila || kutuk -> kutuk
		//System.out.println(wordSb + " " + word);
		if(wordSb.toString().equals(word)) {
			flag = true;
		}
		System.out.println(flag);
		return flag;
	}
}