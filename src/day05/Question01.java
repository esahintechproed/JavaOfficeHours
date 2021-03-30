package day05;

import java.util.ArrayList;
import java.util.List;


public class Question01 {

	/*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
	public static void main(String[] args) {
		
		String array1[] = {"John", "Brad", "Angel", "Sofia", "Emily"};
		String array2[] = {"sofia", "brad", "grace", "emily", "hazel"};
		
		arrToList(array1, array2);
		

	}
	
	public static ArrayList<String> arrToList(String arr1[], String arr2[]) {
		
		
		ArrayList<String> arrList = new ArrayList<>();
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i].equalsIgnoreCase(arr2[j])) {
					arrList.add(arr1[i]);
				}
			}
		}
		
		return arrList;
	}
	

}





