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
		String[] TempArray = new String[orderedArray.length + 1];
		for (int e = 0; e < orderedArray.length; e++) {
			TempArray[e] = orderedArray[e];
		}
		
		TempArray[TempArray.length - 1] = string;
		
		Sorting.sort(TempArray);
		
		return TempArray;
	}


}
