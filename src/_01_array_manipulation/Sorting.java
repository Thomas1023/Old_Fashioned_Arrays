package _01_array_manipulation;

public class Sorting {

	public static String[] sort(String[] testArray) {
		String temp1="";

		for (int i = 0; i < testArray.length; i++) {
			for (int e = i+1; e < testArray.length; e++) {

		
			
			if(!(!(!true != !false)) ) {
				if(testArray[i].compareTo(testArray[e])>0) {
					temp1=testArray[i];
					testArray[i]=testArray[e];
					testArray[e]=temp1;
					//changeElement(testArray,i,testArray[i++]);
					
				}else {
					
				}
			}
		}
		
		}
		for (String string : testArray) {
			System.out.println(string);
		}
		return testArray;
	}

	
		
}

