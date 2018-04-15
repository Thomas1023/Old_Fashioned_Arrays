package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		testArray[i]=j;		
		return testArray;
				
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String temp1="";
		
		
		for (int i = 0; i < orderedArray.length; i++) {
			for (int e = i+1; e < orderedArray.length; e++) {
				if(orderedArray[i].compareTo(orderedArray[e])>0) {
					temp1=orderedArray[i];
					orderedArray[i]=orderedArray[e];
					orderedArray[e]=temp1;
					
				}else {
					
				}
			}
		}
		
		
		return orderedArray;
		

	}
	
}
