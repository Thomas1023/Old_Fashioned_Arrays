package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int test = 0;
		test = testArray[i];
		// test1 = testArray[j];

		testArray[i] = testArray[j];
		testArray[j] = test;
		System.err.println("from" + testArray[j]);
		System.err.println("from" + testArray[i]);

		return testArray;

	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String temp1 = "";	//Bubble sort holder

		String[] tArray = new String[orderedArray.length + 1]; //new array with included variable
		for (int i = 0; i < orderedArray.length; i++) { //iterate thru array to reconstruct it
			tArray[i] = orderedArray[i]; 				//Moving assets of old array
		}
		tArray[orderedArray.length + 1] = string;	//adding new string to array

		for (int i = 0; i < tArray.length; i++) {			//
			for (int e = i + 1; e < tArray.length; e++) {    //
				if (tArray[i].compareTo(tArray[e]) > 0) {    //
					temp1 = tArray[i];						//Bubble Sort
					tArray[i] = tArray[e];					//
					tArray[e] = temp1;						//
															//
				} else {

				}
			}
		}

		return tArray;//returns sorted

	}

}
