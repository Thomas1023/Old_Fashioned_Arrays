package _02_diy_array_list;

public class ArrayList<T> {
	T[] Ts = (T[]) new Object[0];

	int Temp = Ts.length;

	public boolean contains(String string) {
		boolean temp = false;
		for (T t : Ts) {
			if (t.equals(string)) {
				temp = true;
			}
		}
		return temp;
	}

	public void remove(int i) {
		int temp = 0;
		T[] tss = (T[]) new Object[Ts.length - 1];
		for (int j = 0; j < Ts.length; j++) {
			if (i != j) {
				tss[temp] = Ts[j];
				System.out.println(tss[temp]);

				temp++;
			}
			
		}
		Ts=tss;
		
		
	}

	public void add(T i) {
		T[] temp = (T[]) new Object[Ts.length + 1];
		for (int j = 0; j < Ts.length; j++) {
			temp[j] = Ts[j];
		}
		temp[temp.length - 1] = i;
		Ts = temp;
//		Ts = (T[]) new Object[Ts.length + 1];
//
//		for (int j = 0; j < temp.length; j++) {
//			Ts[j] = temp[j];
//		}
//		Ts[Ts.length - 1] = (T) i; // reshape
	}

	public ArrayList() {

	}

	public T get(int i) {

		return Ts[i];
	}

	public void addAt(int i, T c) {
		T[] Tempray = (T[]) new Object[Ts.length + 1];
		for (int h = 0; h < i; h++) {
			Tempray[h] = Ts[h];
		}
		Tempray[i] = (T) c;
		for (int e = 0; e < Ts.length - i; e++) {
			Tempray[e + i + 1] = Ts[e + i];
		}
		Ts = (T[]) new Object[Ts.length + 1];
		Ts = Tempray;

	}

	public void set(int i, T string) {
		Ts[i] = (T) string;

	}

}
