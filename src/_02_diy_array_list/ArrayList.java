package _02_diy_array_list;

public class ArrayList<T>{
	public boolean contains(String string) {
		return false;
	}
	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	T[] Ts = (T[]) new Object[0];
	int Temp = Ts.length;
	public void add(Object i) {
		Object[] temp = new Object[Ts.length];
	 for (int j = 0; j < Ts.length; j++) {
		temp[j] = Ts[j];
	 }
	 
	 Ts = (T[]) new Object[Ts.length + 1];
	 
	 for (int j = 0; j < temp.length; j++) {
			Ts[j] = (T) temp[j];
	 }
	 Ts[Ts.length - 1] = (T) i;	//reshape
	 Temp = Ts.length;
	}
	
	public ArrayList(){
		
	}

	public T get(int i) {
		
		return (T) Ts[i];
	}

	

	public void addAt(int i, Object c) {
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
public void set(int i, Object string) {
		Ts[i] = (T)string;
		
	}




	

}
